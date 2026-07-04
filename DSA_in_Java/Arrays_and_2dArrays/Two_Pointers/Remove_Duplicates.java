package Arrays_and_2dArrays.Two_Pointers;

import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3, 4, 4};

        int[] b = {4 , 1 , 3 , 2 , 1 , 2 , 4 , 5};

        Remove_Duplicates r = new Remove_Duplicates();
        r.forSorted(a);
        System.out.println();
        r.forUnsorted(b);

    }

    public void forSorted(int[] a) {
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[j]) {
                a[j + 1] = a[i];
                j++;
            }
        }
        int newLength = j + 1;
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public void forUnsorted(int[] a){
        Arrays.sort(a);
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[j]) {
                a[j + 1] = a[i];
                j++;
            }
        }
        int newLength = j + 1;
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
