//import java.util.Scanner;
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
//    void insert(int data){
//        node newnode = new node(data);
//
//        if(head==null){
//            head= newnode;
//            temp = newnode;
//        }
//        else{
//            temp.next = newnode;
//            temp= newnode;
//        }
//    }
//    void insert_end(int data){
//        node newnode=  new node(data);
//        temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=newnode;
//    }
//    void insertpos(int data,int m){
//        temp = head;
//        node newnode = new node(data);
//        if(m==1){
//            newnode.next=head;
//            head= newnode;
//            return;
//        }
//        for(int i=1;i<=m-1;i++){
//            temp=temp.next;
//        }
//        if(temp!=null) {
//            newnode.next = temp.next;
//            temp.next = newnode;
//        }
//    }
//    void deletebeg(){
//        temp = head.next;
//        head=null;
//        head= temp;
//    }
//    void deleteend(){
//        temp= head;
//        node prev=temp;
//        while(temp.next!=null){
//            prev=temp;
//            temp=temp.next;
//        }
//        prev.next=null;
//    }
//    void deletepos(int k){
//
//        if(k==1){
//            temp= head.next;
//            head=null;
//            head= temp;
//            return;
//        }
//        temp=head;
//        node prev =temp;
//        for(int i=1;i<k;i++){
//            prev=temp;
//            temp=temp.next;
//        }
//        prev.next=null;
//        prev.next=temp.next;
//    }
//    void display(){
//        node temp = head;
//
//        while(temp!=null){
//            System.out.println(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    void size(){
//        temp=head;
//        int count=0;
//        while(temp!=null){
//            temp=temp.next;
//            count++;
//        }
//        System.out.print(count);
//    }
//    void search(int target,int m){
//        temp=head;
//        int index=1;
//        while(temp!=null){
//            if(temp.data==target){
//                System.out.println(index);
//                temp.data=m;
//                break;
//            }
//            index++;
//            temp=temp.next;
//        }
//    }
//    public static void main(String []args){
//        sll obj = new sll();
//        Scanner sc = new Scanner(System.in);
//        obj.insert(30);
//        obj.insert(80);
//        obj.insert(20);
//        //obj.insertpos(29,1);
//        //obj.deletebeg();
//        //obj.deleteend();
//        //obj.deletepos(1);
//        //obj.size();
//
//        obj.search(30,99);
//        obj.display();
//    }
//}