//import java.util.*;
//
//class stack {
//    int size;
//    char arr[];
//    int top;
//
//    stack(int size) {
//        this.size = size;
//        this.arr = new char[size];
//        this.top = -1;
//    }
//
//    void push(char val) {
//        if (top == size - 1) {
//            System.out.println("full");
//        } else {
//            arr[++top] = val;
//        }
//    }
//
//    char pop() {
//        if (top == -1) {
//            System.out.println("nil");
//            return '\0';
//        } else {
//            return arr[top--];
//        }
//    }
//
//    boolean isEmpty() {
//        return top == -1;
//    }
//
//    boolean check(char[] inputArr) {
//        Stack<Character> st = new Stack<>();
//        for (int i = 0; i < inputArr.length; i++) {
//            char ch = inputArr[i];
//            if (ch == '(' || ch == '[' || ch == '{') {
//                st.push(ch);
//            } else if (ch == ')' || ch == ']' || ch == '}') {
//                if (st.isEmpty()) {
//                    return false;
//                }
//                char topChar = st.pop();
//                if ((ch == ')' && topChar != '(') ||
//                        (ch == ']' && topChar != '[') ||
//                        (ch == '}' && topChar != '{')) {
//                    return false;
//                }
//            }
//        }
//        return st.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        stack obj = new stack(10);
//
//        char[] expression = {'(', '}', '[', ']', ')', ')'};
//
//        if (obj.check(expression)) {
//            System.out.println("Balanced");
//        } else {
//            System.out.println("Not Balanced");
//        }
//    }
//}