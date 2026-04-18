//import java.util.*;
//class node{
//    int data;
//    node next;
//    node(int data){
//        this.data=data;
//        this.next=next;
//    }
//}
//public class asses1 {
//    node head;
//    node temp1;
//    node temp2;
//    void create(int data){
//        node newnode=new node(data);
//        if(head==null){
//            head=newnode;
//            temp1=newnode;
//        }
//        else{
//            temp1.next=newnode;
//            temp1=newnode;
//        }
//    }
//    void display(){
//        temp1=head;
//        while(temp1!=null){
//            System.out.print(temp1.data+" ");
//            temp1=temp1.next;
//        }
//    }
//    void comman(node temp2,node temp1){
//        node t1=temp1;
//        while(t1!=null){
//            node t2=temp2;
//            while(t2!=null){
//                if(t1.data==t2.data){
//                    System.out.print(t1.data+" ");
//                    break;
//                }
//                t2=t2.next;
//            }
//            t1=t1.next;
//        }
//    }
//    void reverse(int n, int k) {
//        if (head == null) return;
//
//        node curr = head;
//        for (int i = 0; i < n / 2; i++) {
//            System.out.print(curr.data + " ");
//            curr = curr.next;
//        }
//
//        node prev = null;
//        node nextNode = null;
//        node tailOfFirstPart = curr;
//
//        for (int i = 0; i < k && tailOfFirstPart != null; i++) {
//            nextNode = tailOfFirstPart.next;
//            tailOfFirstPart.next = prev;
//            prev = tailOfFirstPart;
//            tailOfFirstPart = nextNode;
//        }
//        node temp = prev;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//    public static void main(String[] args) {
//        // Your code here
//        Scanner sc = new Scanner(System.in);
//        asses1 obj = new asses1();
//        asses1 obj2=new asses1();
//        int n=1;
//        for(int i=1;i<=10;i++){
//            obj.create(i);
//        }
////        node node1=obj.head;
////        node node2=obj2.head;
////        obj2.comman(node2,node1);
//        //obj.display();
//        obj.reverse(3,n);
//        System.out.println();
//        //obj.display();
//    }
//}
