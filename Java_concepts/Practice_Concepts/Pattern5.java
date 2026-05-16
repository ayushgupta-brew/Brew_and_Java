package Practice_Concepts;

/*
 * * * * *
 * * * *
 * * *
 * *
 *
*/

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers for pattern ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }

    public static void pattern(int n){
        for (int i = n; i >=1 ; i--) {
            for (int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
