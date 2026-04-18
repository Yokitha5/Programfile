//import java.util.*;
//class node{
//    int data;
//    node next;
//    node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class sll{
//    node head=null;
//    node temp;
//    void remove(){
//        temp=head;
//        while(temp!=null && temp.next!=null){
//            if(temp.data==temp.next.data){
//                System.out.println("duplicate");
//                temp.next=temp.next.next;
//            }
//            temp=temp.next;
//        }
//    }
//    void create(int data){
//        node newnode = new node(data);
//        if(temp==null){
//            head=newnode;
//            temp=newnode;
//        }
//        else{
//            temp.next=newnode;
//            temp=newnode;
//        }
//    }
//    void display(){
//        node temp = head;
//
//        while(temp!=null){
//            System.out.println(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    public static void main(String[] args){
//        sll obj=new sll();
//
//    }
//}