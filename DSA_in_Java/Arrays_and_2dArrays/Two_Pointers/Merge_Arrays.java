package Arrays_and_2dArrays.Two_Pointers;


import java.util.Arrays;

public class Merge_Arrays {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 4};
        int[] b = {2, 2, 4, 4};
        int len = a.length + b.length;
        int[] merged = new int[len];

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            merged[index++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merged[index++] = b[i];
        }
        removeDuplicate(merged);
    }

    public static void removeDuplicate(int[] merged) {
        Arrays.sort(merged);
        int j = 0;
        for (int i = 1; i < merged.length; i++) {
            if (merged[i] != merged[j]) {
                merged[j + 1] = merged[i];
                j++;
            }
        }
        int newLength = j + 1;
        for (int i = 0; i < newLength; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
