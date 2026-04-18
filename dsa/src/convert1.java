//class queue {
//    int size;
//    int[] arr;
//    int front;
//    int rear;
//
//    queue(int size) {
//        this.size = size;
//        this.arr = new int[size];
//        this.front = -1;
//        this.rear = -1;
//    }
//
//    void enqueue(int data) {
//        if (rear == size - 1) return;
//        if (front == -1) front = 0;
//        rear++;
//        arr[rear] = data;
//    }
//
//    int dequeue() {
//        if (front == -1 || front > rear) return -1;
//        int val = arr[front];
//        front++;
//        return val;
//    }
//
//    int peek() {
//        if (front == -1 || front > rear) return -1;
//        return arr[front];
//    }
//
//    int getCount() {
//        if (front == -1 || front > rear) return 0;
//        return (rear - front + 1);
//    }
//
//    int operation(String s, int k) {
//        int n = s.length();
//        int totalFlips = 0;
//
//        for (int i = 0; i < n; i++) {
//            while (getCount() > 0 && peek() < i) {
//                dequeue();
//            }
//
//            int currentBit = s.charAt(i) - '0';
//            int activeFlips = getCount();
//
//            if (activeFlips % 2 == currentBit) {
//                if (i + k > n) {
//                    return -1;
//                }
//                totalFlips++;
//                enqueue(i + k - 1);
//            }
//        }
//        return totalFlips;
//    }
//
//    public static void main(String[] args) {
//        String s = "11000110111";
//        int k = 2;
//        queue obj = new queue(s.length());
//        System.out.println(obj.operation(s, k));
//    }
//}