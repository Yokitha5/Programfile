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
//    void rotate(){
//        node one=head;
//        node two = head.next;
//        temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=one;
//        head=two;
//        one.next=null;
//
//
//    }
//    public static void main(String []args){
//        sll obj = new sll();
//        obj.create(10);
//        obj.create(30);
//        obj.create(90);
//        int n=2;
//        for(int i=0;i<n;i++){
//            obj.rotate();
//        }
//        obj.display();
//    }
//}

//class node{
//    int data;
//    node next;
//    node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class kthrotate{
//    node head;
//    node temp;
//    void create(int data){
//        node newnode = new node(data);
//        if(head==null){
//            head=newnode;
//            temp = newnode;
//        }
//        else{
//            temp.next= newnode;
//            temp=newnode;
//        }
//    }
//    void display(){
//        temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    void rotate(){
//        node one =head;
//        node two =  head.next;
//        temp= head;
//        while(temp.next!=null){
//            temp = temp.next;
//        }
//        temp.next=one;
//        head=two;
//        one.next =null;
//    }
//    public static void main(String []args) {
//        kthrotate obj = new kthrotate();
//        obj.create(10);
//        obj.create(30);
//        obj.create(90);
//        obj.create(91);
//        obj.create(92);
//        obj.display();
//        System.out.println();
//        int n = 2;
//
//        for (int i = 0; i < 9; i++) {
//            obj.rotate();
//            obj.display();
//            System.out.println();
//        }
//    }
//}