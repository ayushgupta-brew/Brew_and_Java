package Practice_Concepts;

/*
1
2 3
4 5 6
7 8 9 10
*/

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for pattern ");
        int n = sc.nextInt();

        pattern(n);
    }

    public static void pattern(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

}
