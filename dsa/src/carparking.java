import java.util.*;
class queue {
    int size;
    String[] arr;
    int arr2[];
    int front = -1;
    int rear = -1;
    int w;
    String t1 = null;
    String t2 = null;
    int time1;
    int time2;

    queue(int size, int w) {
        this.size = size;
        this.w = w;
        arr = new String[size];
        arr2 = new int[size];

    }

    void arrive(String data, int time) {
        if (t1 == null) {
            t1 = data;
            time1 = time;
        } else if (t2 == null) {
            t2 = data;
            time2 = time;
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else {
                rear++;
            }
            arr[rear] = data;
            arr2[rear] = time;
        }
    }
    void status() {
        System.out.print("Parked: ");
        if (t1 != null) System.out.print(t1 + " ");
        if (t2 != null) System.out.print(t2 + " ");
        if (t1 == null && t2 == null) System.out.print("Empty");

        System.out.print("\nWaiting: ");
        if (front == -1) {
            System.out.print("Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");
    }

    void exit(String data, int time) {
        boolean freed = false;
        if (t1 != null && t1.equals(data)) {
            t1 = null;
            freed = true;
        } else if (t2 != null && t2.equals(data)) {
            t2 = null;
            freed = true;
        }

        if (freed) {
            System.out.println(data + " exited at time " + time);
            while (front != -1 && front <= rear) {
                if (time - arr2[front] > w) {
                    System.out.println(arr[front] + " timed out");
                    front++;
                } else {
                    if (t1 == null) {
                        t1 = arr[front];
                        time1 = arr2[front];
                    } else {
                        t2 = arr[front];
                        time2 = arr2[front];
                    }
                    System.out.println(arr[front] + " moved to parking");
                    front++;
                    break;
                }
            }
            if (front > rear) { front = -1; rear = -1; }
        }
    }

    public static void main(String[] args) {
        queue obj = new queue(5,1);
        Scanner sc = new Scanner(System.in);
        obj.arrive("TN02", 1);
        obj.arrive("TN01", 0);
        obj.arrive("TN02", 1);
        obj.arrive("TN03", 2);
        obj.status();


    }
}