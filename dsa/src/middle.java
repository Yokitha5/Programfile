//class middle{
//    int size;
//    int[] arr;
//    int top;
//    middle(int size){
//        this.size=size;
//        arr= new int[size];
//        top=-1;
//    }
//    void push(int val){
//        if(top==size-1){
//            System.out.print("full"+" ");
//        }
//        else{
//            arr[++top]=val;
//        }
//    }
//    void findmin(int min){
//        for(int i=0;i<4;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.print(min);
//    }
//    public static void main(String[] args){
//        middle obj= new middle(4);
//        obj.push(10);
//        obj.push(20);
//        obj.push(30);
//        obj.push(40);
//        obj.findmin(Integer.MAX_VALUE);
//    }
//}

//import java.util.*;
//class node{
//    int data;
//    node next;
//    node(int data){
//        this.data=data;
//        this.next=next;
//    }
//}
//public class middle {
//    node head;
//    node temp1;
//    node temp2;
//
//    void create(int data) {
//        node newnode = new node(data);
//        if (head == null) {
//            head = newnode;
//            temp1 = newnode;
//        } else {
//            temp1.next = newnode;
//            temp1 = newnode;
//        }
//    }
//    void max(){
//        node temp=head;
//        int max=0;
//        while(temp!=null){
//            if(temp.data>max){
//                max=temp.data;
//            }
//            temp=temp.next;
//        }
//        System.out.print(max);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        middle obj= new middle();
//        for(int i=0;i<5;i++){
//            obj.create(i);
//        }
//        obj.max();
//    }
//}