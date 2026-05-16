package Practice_Concepts;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = sc.nextInt();

        isPrime(number);
        sc.close();
    }

    public static void isPrime(int n){
        int count = 0;

        if (n < 1) {
            System.out.println("number cannot be less than 1");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                count++;
            }
        }
        if (count == 0) System.out.println("Prime");

        else System.out.println("Not Prime");
    }
}
