package Practice_Concepts;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = sc.nextInt();

        fibonacci(number);

        sc.close();
    }

    public static void fibonacci(int n) {

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            // swapping
            int c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
