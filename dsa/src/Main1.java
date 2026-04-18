//import com.sun.tools.javac.Main;
//
//class node{
//    int data;
//    node next;
//    node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class Main1{
//    node head;
//    node temp;
//    void insert(int data){
//        node newnode = new node(data);
//        if(head==null){
//            head= newnode;
//            return;
//        }
//
//        temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=newnode;
//
//    }
//    void display(){
//        temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    void reverse(int k){
//        node slow=head;
//        node fast=head;
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        node bef= head;
//        while(bef.next!=slow){
//            bef=bef.next;
//        }
//        node curr=slow;
//        node prev=null;
//        int count=0;
//        while(curr!=null && count<k){
//            node nextt=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=nextt;
//            count++;
//        }
//        bef.next=prev;
//        slow.next=curr;
//    }
//    void remove(int n){
//        if (head.data == n) {
//            head = head.next;
//            return;
//        }
//        temp = head;
//        while(temp.next!=null && temp.next.data!=n){
//            temp = temp.next;
//        }
//        while(temp.next!=null) {
//            temp.next= temp.next.next;
//        }
//    }
//    public static void main(String[] args) {
//        Main1 obj = new Main1();
//        for(int i=1;i<=7;i++) {
//            obj.insert(i);
//        }
//        obj.remove(6);
//        obj.display();
//    }
//}