package Arrays_and_2dArrays.Two_Pointers;

public class Move_Zeros_toEnd {

    public static void main(String[] args) {

        int[] array = {1, 2, 0, 4, 3, 0, 5, 0};

        moveZeroToEnd(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Moves all zeros to the end while maintaining the relative order
    // of non-zero elements using the two-pointer technique.
    public static void moveZeroToEnd(int[] array) {

        // Points to the position where the next non-zero element
        // should be placed.
        int insertPos = 0;

        // Traverse the array using the right pointer.
        for (int right = 0; right < array.length; right++) {

            // If a non-zero element is found,
            // swap it with the element at insertPos.
            if (array[right] != 0) {

                swap(array, insertPos, right);

                // Move insertPos to the next position.
                insertPos++;
            }
        }
    }

    // Swaps two elements in the array.
    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}