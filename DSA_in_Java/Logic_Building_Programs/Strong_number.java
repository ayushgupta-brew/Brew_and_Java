package Logic_Building_Programs;

import java.util.Scanner;

public class Strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            sum += factorial;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.print("Strong number");
        } else {
            System.out.print("Not a Strong number");
        }
    }
}
