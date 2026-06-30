package Practice_Concepts;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number for pattern ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }

    public static void pattern(int n1) {
        for (int i = 1; i <= n1; i++) {
            // Print spaces
            for (int j = 1; j <= n1-1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

