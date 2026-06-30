package Arrays_and_2dArrays.One_D_Array;

public class Consecutive_ones {

    static void main(String[] args) {

        // Input array containing 0s and 1s
        int[] array = {1, 0, 1, 1, 0, 1};

        // Call the method to find the maximum consecutive 1s
        int result = consecutiveOne(array);

        // Print the result
        System.out.println(result);
    }

    /**
      Finds the maximum number of consecutive 1s in the array.

      Example:
      Input  : [1, 0, 1, 1, 0, 1]
      Output : 2

      array Input integer array containing 0s and 1s
      Maximum count of consecutive 1s
     */
    public static int consecutiveOne(int[] array) {

        // Tracks the current streak of consecutive 1s
        int count = 0;

        // Stores the maximum streak found so far
        int maxLength = 0;

        // Traverse each element of the array
        for (int i : array) {

            // If the current element is 1,
            // increase the current streak count
            if (i == 1) {
                count++;
            } else {
                // If a 0 is encountered,
                // reset the current streak
                count = 0;
            }

            // Update the maximum streak if current streak is larger
            maxLength = Math.max(count, maxLength);
        }

        // Return the longest consecutive sequence of 1s
        return maxLength;
    }
}