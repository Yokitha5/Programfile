import java.util.*;
class ds3{
    int size;
    String[] arr;
    int top;
    ds3(int size){
        this.size=size;
        arr = new String[size];
        top=-1;
    }
    void push(String val){
        if(top==size-1){
            System.out.println();
        }
        else{
            arr[++top]=val;
        }
    }
    String pop(){
        if(top==-1){
            return null;
        }
        else {
            return arr[top--];
        }
    }

//    void largeafter(int[] arr) {
//        for (int j = 0; j < arr.length; j++) {
//            int k=arr[j];
//            int min = Integer.MAX_VALUE;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] > k && arr[j] < min) {
//                    min=arr[j];
//                    push(arr[i]);
//                }
//            }
//            System.out.println(arr[j]+" "+pop());
//        }
//    }

//    void reverse(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            push(arr[i]);
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(pop()+" ");
//        }
//    }

//    void previous(int[] arr){
//        push(-1);
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>=arr[i-1]){
//                push(arr[i-1]);
//            }
//            else{
//                push(-1);
//            }
//        }
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(pop()+" ");
//        }
//    }

//    void rev(String s){
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            push(c);
//        }
//        for(int i=0;i<s.length();i++){
//            System.out.print(pop());
//        }
//    }

//    void bracket(String s){
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(c=='['){
//                push(c);
//            }
//            else if(c==']'){
//                pop();
//            }
//            if(top==-1){
//                System.out.println(i);
//                break;
//            }
//        }
//    }
    String peek(){
        if(top==-1){
            return null;
        }
        else {
            return arr[top];
        }
    }
    void check(String arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==peek()){
                pop();
            }
            else{
                push(arr[i]);
            }
        }
        int count =0;
        while(top!=-1){
            count++;
            pop();
        }
        System.out.print(count);
    }
    public static void main(String[] args){
        String[] arr= {"gfg","hhh","for", "geeks", "geeks", "for"};
        ds3 obj = new ds3(arr.length);
//        obj.largeafter(arr);
//        obj.reverse(arr);
//        obj.previous(arr);
//        obj.rev("Hello World");
//        obj.bracket("[ABC[23]][89]");
        obj.check(arr);

    }
}
