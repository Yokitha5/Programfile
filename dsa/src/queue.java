//class node{
//    int data;
//    node next;
//    node front;
//    node rear;
//    node(int data){
//        this.data = data;
//        this.next=null;
//        this.front =null;
//        this.rear=null;
//    }
//}
//class queue {
//    node temp;
//    node front;
//    node rear;
//
//    void enque(int data) {
//
//        node newnode = new node(data);
//        if(rear==null && front==null){
//            front= newnode;
//            rear= newnode;
//        }
//        else{
//            rear.next=newnode;
//            rear= newnode;
//        }
//    }
//    void display(){
//        node temp=front;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    void deque(){
//        node temp=front;
//        if(front==null){
//            System.out.print("under");
//        }
//        else{
//            front = front.next;
//        }
//    }
//    void peek(){
//        System.out.println(front.data);
//    }
//    public static  void main(String[] args){
//        queue obj = new queue();
//        for(int i=1;i<=5;i++){
//            obj.enque(i);
//        }
//        obj.deque();
//        obj.display();
//        obj.peek();
//    }
//}



//class queue{
//    int size;
//    int[] arr;
//    int front=-1;
//    int rear=-1;
//    queue(int size){
//        this.size=size;
//        arr = new int[size];
//
//    }
//    void enqueufront(int data){
//    if((rear+1)%size==front)
//    {
//        System.out.println("Queue Overflow");
//    }
//        else if(front ==-1 && rear==-1){
//            front++;
//            rear++;
//        }
//        else if (front==0)
//        {
//            front =size-1;
//
//        }
//        else {
//            front--;
//        }
//        arr[front]=data;
//    }
//    void enqueu(int data) {
//         if ( front == -1 && rear == -1){
//            front++;
//            rear++;
//            arr[rear] = data;
//        }
//        else{
//            arr[++rear]=data;
//        }
//    }
//    void dequeue(){
//        if(front==-1 && rear==-1){
//            System.out.print("over");
//        }
//        else{
//            int del= arr[front];
//            front++;
//        }
//    }
//    void peek(){
//        if(front==-1 && rear==-1){
//            System.out.print("over");
//        }
//        else{
//            System.out.print(arr[front]);
//        }
//    }
//    void display(){
//        for(int i=front;i<=rear;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    void dequeurear(){
//        int del=arr[rear];
//        rear--;
//        System.out.println(del);
//    }
//    public static void main(String[] args){
//        queue obj = new queue(5);
//        for(int i=1;i<=5;i++){
//            obj.enqueu(i);
//        }
//        obj.display();
//        obj.dequeue();
//        System.out.println();
//        obj.enqueufront(20);
//        obj.display();
//        System.out.println();
//        obj.dequeurear();
//        System.out.println();
//        obj.display();
//    }
//}

//

//
//class node{
//    int data;
//    node next;
//    node front;
//    node rear;
//    node(int data){
//        this.data = data;
//        this.next=null;
//        this.front =null;
//        this.rear=null;
//    }
//}
//class queue {
//    node temp;
//    node front;
//    node rear;
//
//    void enque(int data) {
//
//        node newnode = new node(data);
//        if(rear==null && front==null){
//            front= newnode;
//            rear= newnode;
//
//        }
//        else{
//            rear.next=newnode;
//            rear= newnode;
//            rear.next=front;
//        }
//    }
//    void display(){
//        node temp=front;
//
//        while(true){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//            if(temp==front)
//                break;
//        }
//    }
//    void deque(){
//        node temp=front;
//        if(front==null){
//            System.out.print("under");
//        }
//        else{
//            front =front.next;
//            rear.next = front;
//
//        }
//    }
//    void peek(){
//        System.out.println(front.data);
//    }
//    public static  void main(String[] args){
//        queue obj = new queue();
//        for(int i=1;i<=5;i++){
//            obj.enque(i);
//        }
//        obj.deque();
//        obj.display();
//        //obj.peek();
//    }
//}


//class node{
//    int data;
//    node next;
//    node prev;
//    node(int data){
//        this.data=data;
//        this.prev=null;
//        this.prev=null;
//    }
//}
//class queue{
//    node head;
//    node temp;
//    void enque(int data){
//
//    }
//}

