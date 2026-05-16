package Recursion;

import java.util.*;

public class Print_Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        OnetoN(n, 1);
        System.out.println();
        OnetoN(n);
        System.out.println();
        NtoOne(n);
    }

    public static void OnetoN(int n, int x) {
        if (n < x) return;  // Base case

        System.out.print(x + " ");
        OnetoN(n, x + 1);  // recursive call
    }

    public static void OnetoN(int n) {
        if (n == 0) return;   // Base case

        OnetoN(n-1);  // recursive call
        System.out.print(n+ " ");
    }
    public static void NtoOne(int n){
        if(n == 0) return;  // Base case

        System.out.print(n + " ");
        NtoOne(n-1);  // recursive call
    }
}
