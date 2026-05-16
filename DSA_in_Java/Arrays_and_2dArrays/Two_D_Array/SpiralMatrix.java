package Arrays_and_2dArrays.Two_D_Array;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // cols

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {

            // left → right  (Top row)
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // top → bottom  (Right column)
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // right → left  (Bottom row)
            for (int i = right; i >= left; i--) {
                System.out.print(a[bottom][i] + " ");
            }
            bottom--;

            // bottom → top  (Left column)
            for (int i = bottom; i >= top; i--) {
                System.out.print(a[i][left] + " ");
            }
            left++;
        }
        sc.close();
    }
}
