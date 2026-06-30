package Recursion;

import java.util.*;
public class Sum_In_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){

        // base case for sum + 0 = sum
        if(n == 0) return 0;

        // recursive case to add the numbers
        return n + sum(n-1);
    }
}
