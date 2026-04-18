//class Node {
//    int data;
//    Node prev;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//
//class DLL {
//    Node head;
//    Node tail;
//
//    void insertAtEnd(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = tail = newNode;
//        } else {
//            newNode.prev = tail;
//            tail.next = newNode;
//            tail=newNode;
//        }
//    }
//    public void insertAtStart(int newData) {
//        Node newNode = new Node(newData);
//        Node temp = head;
//        if (temp == null) {
//            head= newNode;
//            tail=newNode;
//        }
//        else{
//            newNode.prev= temp;
//            temp.next=newNode;
//            temp= newNode;
//        }
//    }
//    void deleteAtStart() {
//        if (head == null) return;
//        if (head == tail) {
//            head = tail = null;
//        } else {
//            head = head.next;
//            head.prev = null;
//        }
//    }
//    public void insertAtPosition(int data, int position) {
//        if (position == 0) {
//            insertAtStart(data);
//            return;
//        }
//        Node newNode = new Node(data);
//        Node current = head;
//        for (int i = 0; i < position - 1 && current != null; i++) {
//            current = current.next;
//        }
//        newNode.next = current.next;
//        newNode.prev = current;
//        if (current.next != null) {
//            current.next.prev = newNode;
//        }
//        current.next = newNode;
//    }
//    void deleteAtEnd() {
//        if (tail == null) return;
//        if (head == tail) {
//            head = tail = null;
//        } else {
//            tail = tail.prev;
//            tail.next = null;
//        }
//    }
//
//    void deleteAtPos(int pos) {
//        if (head == null || pos <= 0) return;
//        if (pos == 1) {
//            deleteAtStart();
//            return;
//        }
//        Node temp = head;
//        for (int i = 1; temp != null && i < pos; i++) {
//            temp = temp.next;
//        }
//        if (temp == null) return;
//        if (temp == tail) {
//            deleteAtEnd();
//        } else {
//            temp.prev.next = temp.next;
//            temp.next.prev = temp.prev;
//        }
//    }
//
//    void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + (temp.next != null ? " <=> " : ""));
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        DLL list = new DLL();
//        list.insertAtEnd(10);
//        list.insertAtEnd(20);
//        list.insertAtEnd(30);
//        list.insertAtEnd(40);
//        list.display();
//
//        list.deleteAtStart();
//        list.display();
//
//        list.deleteAtEnd();
//        list.display();
//
//        list.deleteAtPos(1);
//        list.insertAtStart(99);
//        list.display();
//    }
//}