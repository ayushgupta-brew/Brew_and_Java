package Logic_Building_Programs;

import java.util.Scanner;

public class PermutationCombination_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int i = permutation(n, r);
        int j = combination(n, r);

        System.out.println(i);
        System.out.println(j);

    }
    public static int permutation(int num1, int num2) {
        return factorial(num1) / factorial(num1 - num2);
    }

    public static int combination(int num1, int num2) {
        return factorial(num1) / (factorial(num2) * factorial(num1 - num2));
    }

    public static int factorial(int num) {
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans = ans * i;
        }
        return ans;
    }

}
