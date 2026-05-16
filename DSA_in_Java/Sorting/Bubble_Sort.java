package Sorting;

public class Bubble_Sort {
    public static void main(String[] args){
        int[] arr = {10 , 50 , 200 , 40 , 5};

        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j< arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int k: arr){
            System.out.print(k + " ");
        }
    }
}

/*
 Bubble Sort:
 • Adjacent elements ko compare karke swap karta hai. Adjacent means - next element
 • Har pass me largest element end me "bubble" ho jaata hai.
 • Use case: Chhote datasets aur sorting logic samajhne ke liye.
 • Time Complexity: O(n^2), Best case O(n) (already sorted).
*/
