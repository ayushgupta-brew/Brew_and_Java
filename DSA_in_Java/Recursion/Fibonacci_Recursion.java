package Recursion;

public class Fibonacci_Recursion {
    public static void main(String[] args) {

        int n = 7;

        for (int i = 0 ; i<=n ; i++){
            System.out.print(fibo(i) + " ");
        }
    }
    public static int fibo(int n){

        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        return fibo(n-1) + fibo(n-2);
    }
}
