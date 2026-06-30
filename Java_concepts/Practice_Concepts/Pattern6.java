package Practice_Concepts;

/*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
*/

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number for pattern ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }

    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
