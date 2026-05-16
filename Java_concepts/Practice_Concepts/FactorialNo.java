package Practice_Concepts;

// Factorial number -> 5 factorial is = 5 * 4 * 3 * 2 * 1

import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = sc.nextInt();

        factorial(number);

        sc.close();
    }

    public static void factorial(int n){

        int result = 1;

        if(n < 1) {
            System.out.println("number cannot be less then 1");
            return;
        }

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
