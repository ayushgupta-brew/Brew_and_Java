package Recursion;

import java.util.Scanner;

public class Factorial_In_Recursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Factorial");
        int n = sc.nextInt();

        // storing the static method to an int variable because the function is returning an int value
        int ans = factorial(n);
        System.out.println(ans);
    }

    // static function for factorial print
    public static int factorial(int n){

        // base case for terminating the recursive call
        if(n == 0) return 1;

        // recursive case for calculating the factorial
        return n * factorial(n-1);
    }
}
