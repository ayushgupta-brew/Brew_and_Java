package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for an array");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements for an array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        bubbleSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }


public static void bubbleSort(int[] array) {

    int len = array.length;

    for (int i = 0; i < len; i++) {
        for (int j = 0; j < len - 1 - i; j++) {
            if (array[j] > array[j + 1]) {
                swap(array, j, j + 1);
            }
        }
    }
}

public static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}
}


/*
 Bubble Sort:
 • Adjacent elements ko compare karke swap karta hai. Adjacent means - next element
 • Har pass me largest element end me "bubble" ho jaata hai.
 • Use case: Chhote datasets aur sorting logic samajhne ke liye.
 • Time Complexity: O(n^2), Best case O(n) (already sorted).
*/
