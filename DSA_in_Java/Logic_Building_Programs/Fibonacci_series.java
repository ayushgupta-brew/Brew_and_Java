package Logic_Building_Programs;

import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
//        int a = 0;
//        int b = 1;

//        System.out.print(a + " " + b + " ");
//        for(int i = 2 ; i< n ; i++){
//            int nextTerm = a+b;
//
//            System.out.print(nextTerm + " ");
//
//            a=b;
//            b=nextTerm;
//        }

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        System.out.print(fib[0] + " " + fib[1] + " ");

        for(int i = 2; i< fib.length ; i++){

            int next = fib[0] + fib[1] ;

            System.out.print(next + " ");
            fib[0] = fib[1];
            fib[1] = next;
        }
    }
}
