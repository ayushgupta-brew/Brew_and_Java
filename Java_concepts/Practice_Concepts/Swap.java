package Practice_Concepts;

// swapping without using the temp variable

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number to swap ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        swap(n1 , n2);
    }

    public static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without temp variable
        a = a + b;  // a becomes a + b
        b = a - b;  // b becomes (a + b) - b = a
        a = a - b;  // a becomes (a + b) - a = b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
