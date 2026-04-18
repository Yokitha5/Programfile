//import java.util.*;
////class node {
////    int data;
////    node right;
////    node left;
////    node(int  data){
////        this.data=data;
////        left = null;
////        right = null;
////    }
////}
////class tree{
////    node root;
////    void preorder(node root){
////        prefunction(root);
////    }
////    void prefunction(node temp){
////        if(temp ==null){
////            return;
////        }
////        System.out.println(temp.data);
////        preorder(temp.left);
////        preorder(temp.right);
////    }
////    public static void main(String[] args){
////        tree obj = new tree();
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        for(int i=0;i<n;i++) {
////            obj.root = new node(i);
////            obj.root.left = new node(i+1);
////            obj.root.right = new node(i+2);
////            obj.prefunction(obj.root);
////        }
////    }
////}
//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    Node(int data){
//        this.data=data;
//        right = null;
//        left = null;
//    }
//}
//class tree{
//    Node root;
//    void insert(int data){
//        Node newnode =new Node(data);
//        if(root==null){
//            root=newnode;
//            return;
//        }
//        int front=0;
//        int rear=0;
//
//        Node[] queue = new Node[100];
//        queue[rear++]=root;
//        while(front<rear){
//            Node temp =queue[front++];
//            if(temp.left==null){
//                temp.left=newnode;
//                return;
//            }
//            else{
//                queue[rear++]=temp.left;
//            }
//            if(temp.right==null){
//                temp.right=newnode;
//                return;
//            }
//            else{
//                queue[rear++] =temp.right;
//            }
//        }
//
//    }
//    public int findHeight(Node node) {
//        if (node == null) {
//            return 0;
//        }
//        int leftHeight = findHeight(node.left);
//        int rightHeight = findHeight(node.right);
//        return Math.max(leftHeight, rightHeight) + 1;
//    }
//    void preorder(Node root){
//        prefunction(root);
//    }
//    void prefunction(Node temp){
//        if(temp ==null){
//            return;
//        }
//        System.out.println(temp.data);
//        preorder(temp.left);
//        preorder(temp.right);
//    }
//    public static void main(String[] args) {
//        tree obj = new tree();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=10;i++){
//            obj.insert(i);
//        }
//        obj.preorder(obj.root);
//        System.out.print(obj.findHeight(obj.root));
//    }
//}