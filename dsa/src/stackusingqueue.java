import java.util.*;
class stack {
    int size;
    int arr[];
    int top;

    stack(int size) {
        this.size = size;
        this.arr = new int[size];
        top=-1;
    }
    void push(int data){
        if(top==size-1){
            System.out.print("overflow");
        }
        else{
            arr[++top]=data;
        }
    }
    int pop(){
        if(top==-1){
            return -1;
        }
        else{
            int val = arr[top];
            top--;
            return val;
        }
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

}
public class stackusingqueue {
    private stack stack1;
    private stack stack2;

    public stackusingqueue(int capacity) {
        stack1 = new stack(capacity);
        stack2 = new stack(capacity);
    }

    public void enqueue(int x) {
        stack1.push(x);
    }


    public int dequeue() {
        //emptystack();
        fillStack2();
        int val = stack2.pop();
        if (val == -1) {
            System.out.println("Queue is empty");
        }
        return val;
    }


    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void fillStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
    void emptystack(){
        if(stack1.isEmpty()){
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    void display(){
        fillStack2();
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop()+" ");
            stack1.push(stack2.pop());
        }
        emptystack();
    }

    public static void main(String[] args) {
        stackusingqueue q= new stackusingqueue(5);
        q.enqueue(11);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        System.out.println(q.dequeue());
        q.display();
    }
}
