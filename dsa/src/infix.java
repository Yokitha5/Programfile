import java.util.*;

class infix {
    int precedence(int x){
        if(x=='+' || x=='-'){
            return 1;
        }
        if(x=='*' || x=='/'){
            return 2;
        }
        if(x=='^'){
            return 3;
        }
        else{
            return 0;
        }

    }
    void infixto(String s){
        Stack <Character> st = new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(st.peek()!='('){
                    res+=st.pop();
                }
                st.pop();
            }
            else if(Character.isAlphabetic(c)){
                res+=c;
            }
            else{
                while(!st.isEmpty() && precedence(c)<=precedence(st.peek())){
                    res+=st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        System.out.print(res);
    }
    int calculate(int n1,int n2,String x){
        if (x.equals("+")) return n1 + n2;
        if (x.equals("-")) return n1 - n2;
        if (x.equals("*")) return n1 * n2;
        if (x.equals("/")) return n1 / n2;
        if (x.equals("^")) return (int) Math.pow(n1, n2);
        return 0;
    }
    void postfix(String  s){
        String[] pro = s.trim().split("\\s+");
        Stack <Integer> st= new Stack<>();
        for(int i=0;i<pro.length;i++){
            String c= pro[i];
            if ("+-*/".contains(c) && c.length() == 1){
                int num1=st.pop();
                int num2=st.pop();
                int res = calculate(num2,num1,c);
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(c));
            }
        }
        System.out.print(st.peek());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "5 3 + 2 *";
        infix obj = new infix();
        obj.postfix(s);
    }
}