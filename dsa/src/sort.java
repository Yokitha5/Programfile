//import java.util.Scanner;
//
//class node {
//    int data;
//    node next;
//
//    node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class sll {
//    node head = null;
//    node temp;
//    node temp2;
//    node dummy;
//
//    void create(int data) {
//        node newnode = new node(data);
//        if (head == null) {
//            head = newnode;
//            temp = newnode;
//        } else {
//            temp.next = newnode;
//            temp = newnode;
//        }
//    }
//
//    void display() {
//        node curr = head;
//        while (curr != null) {
//            System.out.print(curr.data + " ");
//            curr = curr.next;
//        }
//        System.out.println();
//    }
//    void sort(){
//        temp=head;
//        while(temp.next!=null){
//            node temp2=temp.next;
//            while (temp2 != null) {
//                if (temp.data > temp2.data) {
//                    int hold = temp.data;
//                    temp.data = temp2.data;
//                    temp2.data = hold;
//                }
//                temp2 = temp2.next;
//            }
//            temp = temp.next;
//        }
//    }
//    public static void main(String []args){
//        sll obj = new sll();
//        obj.create(30);
//        obj.create(10);
//        obj.create(90);
//        obj.sort();
//        obj.display();
//    }
//}