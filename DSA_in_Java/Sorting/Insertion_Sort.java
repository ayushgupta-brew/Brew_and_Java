package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {4 , 1 , 7 , 3 , 9 , 1 , 0 , 8};

        standardShiftingSort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        standardSwappingSort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void standardSwappingSort(int[] arr){
        for(int i = 1 ; i< arr.length ; i++){  // assume i = 1 as 0 index is sorted
            int j = i;       // j also points same as i
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void standardShiftingSort(int[] arr){
        for(int i = 1 ; i<arr.length ; i++){
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

/*
INSERTION SORT (Shifting Version)

Insertion Sort me array ko do parts maana jaata hai:
left part sorted hota hai, right part unsorted.

Index i:
- i unsorted part ka first index hota hai
- i = 1 se start hota hai
- i left se right move karta hai

Index j:
- j = i - 1 se start hota hai
- j sorted part me right se left move karta hai
- jab tak arr[j] > key, elements right shift hote hain
- key ko j + 1 position par insert kiya jaata hai

Complexity:
- Best: O(n), Average/Worst: O(n²)
- Space: O(1) (in-place)
*/
