package Practice_Concepts;

/*
55555
4444
333
22
1
*/

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for pattern ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }
    public static void pattern(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
