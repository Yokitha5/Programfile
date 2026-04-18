//import java.util.*;
//class stack{
//    int size;
//    char arr[];
//    int top;
//    stack(char size){
//        this.size=size;
//        arr= new char[size];
//        int top;
//    }
//    void push(char val){
//        if(top==size-1){
//            System.out.print("full"+" ");
//        }
//        else{
//            arr[++top]=val;
//        }
//    }
//    void pop(){
//        if(top==-1){
//            System.out.print("nil");
//        }
//        else{
//            int c=arr[top--];
//            System.out.println("poped" +c+" ");
//        }
//    }
//    void peek(){
//        if(top==-1){
//            System.out.print("null");
//        }
//        else{
//            System.out.print(arr[size-1]+" ");
//        }
//    }
//    void display(){
//        for(int i=size-1;i>=0;i--){
//            System.out.println(arr[i]+" ");
//        }
//    }
//    boolean check(char[] arr){
//        Stack<Character> st = new Stack<>();
//        for(int i=0;i<4;i++){
//            char ch= arr[i];
//            if(ch=='(' || ch=='[' || ch=='{'){
//                st.push(ch);
//            }
//            else if(ch==')' || ch ==']' ||ch=='}'){
//                if(st.isEmpty()){
//                    return false;
//                    char top = st.pop();
//                    if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
//                        return false;
//                    }
//                }
//            }
//
//        }
//        if(st.isEmpty()){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        stack obj = new stack();
//        obj.push('(');
//        obj.push('(');
//        obj.push('[');
//        obj.push(']');
//        obj.display();
//        obj.check(obj.top);
//    }
//}

//
//class node{
//    char  data;
//    node next;
//    node(char data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class stack{
//    node top;
//    node next;
//    void push(char data){
//        node newnode=new node(data);
//        if(top==null){
//            top=newnode;
//            next=newnode;
//        }
//        else{
//            newnode.next=top;
//            top=newnode;
//        }
//    }
//    void pop(){
//        if(top==null){
//            System.out.print("under");
//        }
//        else{
//            top=top.next;
//        }
//    }
//    void peek(){
//        System.out.print(top.data);
//    }
//    void display(){
//        node temp=top;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        stack obj = new stack();
//        obj.push('(');
//        obj.push('(');
//        obj.push('[');
//        obj.push(']');
//        obj.display();
//        obj.check(obj.top);
//    }
//}