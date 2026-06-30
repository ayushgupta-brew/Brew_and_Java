package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        reverse_partOf_array(a , 3 , 7);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void reverse_full_array(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

    }
        public static void reverse_partOf_array(int[] a , int index1 , int index2){
            int start = index1;
            int end = index2;

            while (start < end) {

                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;

                start++;
                end--;
            }
        }
}