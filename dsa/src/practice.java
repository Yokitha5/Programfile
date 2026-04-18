//import java.util.*;
//class node{
//    node next;
//    int data;
//    node(int data){
//        this.data=data;
//    }
//}
//public class practice{
//    node head;
//    void inseertbeg(int data){
//        node newnode = new node(data);
//        if (head == null) {
//            head = newnode;
//            return;
//        }
//        node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newnode;
//    }
////    void reverse(){
////        temp=head;
////        node prev=null;
////        node next=null;
////        while(temp!=null){
////            next=temp.next;
////            temp.next=prev;
////            prev= temp;
////            temp=next;
////        }
////        head=prev;
////    }
//    void display() {
//        node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//    void oe(){
//        node temp=head;
//        node dummy=new node(0);
//        node temp1=dummy;
//        node temp2=dummy;
//        node t=null;
//        while(temp!=null){
//            if(temp.data%2==0){
//                temp1.next=temp;
//                temp1=temp1.next;
//            }
//            else{
//                temp2.next=temp;
//            }
//            temp=temp.next;
//        }
//
//        while(temp1!=null){
//            System.out.println(temp1.data);
//            temp1=temp1.next;
//        }
//    }
//    void palin(){
//        if (head == null || head.next == null) return;
//        node slow = head;
//        node fast=head;
//        node pre =null;
//        while(fast!=null && fast.next!=null){
//            pre=slow;
//            slow=slow.next;
//            fast = fast.next.next;
//        }
//         node temp=slow;
//        node prev=null;
//        int count=0;
//        while(temp!=null && count<2){
//            node nextt=temp.next;
//            temp.next=prev;
//            prev= temp;
//            temp=nextt;
//            count++;
//        }
//        if(pre!=null){
//            pre.next=prev;
//        }
//        else{
//            head=prev;
//        }
//        if (slow != null) {
//            slow.next = temp;
//        }
//    }
//    public static void main(String[] args){
//        practice o=new practice();
//        o.inseertbeg(1);
//        o.inseertbeg(2);
//        o.inseertbeg(3);
//        o.inseertbeg(4);
//        o.inseertbeg(5);
//        o.inseertbeg(6);
////        o.display();
////        o.reverse();
////        o.display();
//        o.palin();
//        o.display();
//        o.oe();
//    }
//}
