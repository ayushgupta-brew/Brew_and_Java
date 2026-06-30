package Logic_Building_Programs;

import java.util.Scanner;

public class Armstrong_number_withoutString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n; // assign for length calculation
        int count = 0;
        int sum = 0;

        while (original > 0) {
            count++;
            original = original / 10;
        }
        original = n; // wa pas se assign for armStrong calculation

        while (original != 0) {
            int digit = original % 10;

            // manual power implementation
            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * digit;
            }
//            sum = sum + (int) Math.pow(digit, count);
            sum = sum + power;
            original = original / 10;
        }

        if (sum == n) {
            System.out.print("Armstrong");
        } else {
            System.out.print("Not an Armstrong");
        }
    }
}
