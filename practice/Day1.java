import java.util.*;

class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Hello World
        System.out.println("Hello, World!");

        // 2. Sum of Two Numbers
        int a = 5, b = 10;
        System.out.println("Sum: " + (a + b));

        // 3. Even or Odd
        int n = 7;
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // 4. Largest of 3 Numbers
        int x = 10, y = 25, z = 15;
        if (x >= y && x >= z)
            System.out.println("Largest: " + x);
        else if (y >= x && y >= z)
            System.out.println("Largest: " + y);
        else
            System.out.println("Largest: " + z);

        // 5. Swap Two Numbers (without temp)
        int p = 5, q = 10;
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("After Swap: p=" + p + ", q=" + q);

        // 6. Positive / Negative / Zero
        int num = -5;
        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        // 7. Simple Interest
        int P = 1000, R = 5, T = 2;
        double SI = (P * R * T) / 100.0;
        System.out.println("Simple Interest: " + SI);

        // 8. Multiplication Table
        int tableNum = 5;
        System.out.println("Multiplication Table of " + tableNum);
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // 9. Sum of First N Numbers
        int N = 10;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + N + " numbers: " + sum);

        // 10. Reverse a Number
        int number = 123;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reverse);

        sc.close();
    }
}
