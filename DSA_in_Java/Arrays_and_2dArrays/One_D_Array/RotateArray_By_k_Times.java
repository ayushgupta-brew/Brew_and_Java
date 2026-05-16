package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;

public class RotateArray_By_k_Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = sc.nextInt();
        k = k % n; // ensure karne ke liye if k > n ho tab

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }


        Reverse(a, 0, n - k - 1);
        Reverse(a, n - k, n - 1);
        Reverse(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void Reverse(int[] a, int s, int e) {
        int start = s;
        int end = e;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }
}