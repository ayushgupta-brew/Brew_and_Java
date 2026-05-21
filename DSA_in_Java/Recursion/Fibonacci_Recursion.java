package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci_Recursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci series");
        int n = sc.nextInt();

        for (int i = 0 ; i<=n ; i++){
            System.out.print(fibo(i) + " ");
        }
    }

    // static function for printing Fibonacci series
    public static int fibo(int n){

        // base case for terminating recursive call
        if(n == 0) return 0;
        if(n == 1) return 1;

        // recursive call for calculating the Fibonacci numbers
        return fibo(n-1) + fibo(n-2);
    }
}
