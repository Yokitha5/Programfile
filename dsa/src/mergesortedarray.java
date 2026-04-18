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
//
//    void merge(node temp1, node temp2) {
//        node t1 = temp1;
//        node t2 = temp2;
//        node dummy = new node(0);
//        node t3 = dummy;
//
//        while (t1 != null && t2 != null) {
//            if (t1.data < t2.data) {
//                t3.next = t1;
//                t1 = t1.next;
//            } else {
//                t3.next = t2;
//                t2 = t2.next;
//            }
//            t3 = t3.next;
//        }
//
//        if (t1 != null) {
//            t3.next = t1;
//        } else {
//            t3.next = t2;
//        }
//
//        head = dummy.next;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sll obj = new sll();
//        sll obj2 = new sll();
//        sll res = new sll();
//
//        for (int i = 0; i < 3; i++) {
//            obj.create(sc.nextInt());
//        }
//        for (int i = 0; i < 3; i++) {
//            obj2.create(sc.nextInt());
//        }
//
//        res.merge(obj.head, obj2.head);
//        res.display();
//
//        sc.close();
//    }
//}