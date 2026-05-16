package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 8, 2};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

/*
Selection Sort:
• simple sorting technique jo har pass me smallest element ko pick karta hai
• correct position par place karta hai.
• Use case: Chhote arrays ya basic logic samajhne ke liye (O(n^2)).
*/