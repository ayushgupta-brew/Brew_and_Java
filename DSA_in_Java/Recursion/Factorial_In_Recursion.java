package Recursion;

public class Factorial_In_Recursion {
    public static void main(String[] args) {

        int n = 10;
        int ans = factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n){

        if(n == 0) return 1;

        return n * factorial(n-1);
    }
}
