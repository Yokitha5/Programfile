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
//public class reversek {
//    node head;
//    node temp;
//    node fast;
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
//    void display(node head) {
//        node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//
//    node reverse(node head) {
//        temp = head;
//        node prev = null;
//        node next = null;
//        while (temp != null) {
//            next = temp.next;
//            temp.next = prev;
//            prev = temp;
//            temp = next;
//        }
//        return prev;
//    }
//
//    node reversek(node head, int k) {
//        node temp = head;
//        for (int i = 0; i < k ; i++) {
//            if(temp==null) return head;
//            temp = temp.next;
//        }
//        node curr = head;
//        node prev = null;
//        node nextnode = null;
//        for (int i = 0; i < k; i++) {
//            nextnode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextnode;
//        }
//        if (nextnode != null) {
//            head.next = reversek(nextnode, k);
//        }
//        return prev;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        reversek obj = new reversek();
//        for (int i = 1; i < 9; i++) {
//            obj.create(i);
//        }
//        obj.display(obj.head);
//        node temp3 = obj.reversek(obj.head, 3);
//        System.out.println();
//        obj.display(temp3);
//    }
//}