//import java.util.LinkedList;
//
//class node{
//    node next;
//    int data;
//    node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//class sll{
//    node temp;
//    node head;
//    node next;
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
////    int count(node head){
////        return 1+count(head.next);
////    }
//    void arrage(){
//        temp=head;
//        node temp2=head;
//        while(temp!=null){
//
//            if(temp.data%2==0){
//                System.out.print(temp.data+" ");
//
//            }
//            temp=temp.next;
//        }
//        while(temp2!=null){
//            if(temp2.data%2!=0){
//                System.out.print(temp2.data+" ");
//
//            }
//            temp2=temp2.next;
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
//    public static void main(String [] args){
//        sll obj = new sll();
//        LinkedList<Integer> dd=new LinkedList<>();
//        dd.add(10);
//        System.out.println(dd.size());
//        obj.insert(10);
//        obj.insert(10);
//        obj.insert(19);
//        obj.insert(20);
//        obj.insert(11);
//        obj.arrage();
//        //obj.display();
//        //
//        // System.out.print(x);
//
//     }
//}