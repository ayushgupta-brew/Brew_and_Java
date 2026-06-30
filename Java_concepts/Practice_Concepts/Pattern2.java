package Practice_Concepts;
/*
1
22
333
4444
55555
*/

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number for pattern ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }

    public static void pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
