package Arrays_and_2dArrays.One_D_Array;

import java.util.HashMap;
import java.util.Map;

public class Single_Number {

    static void main() {

        // Array where every element appears twice except one element
        int[] array = {4, 1, 2, 1, 2};

        // Find the single occurring number using XOR
        int result = usingXor(array);

        System.out.println(result);
    }

    /**
     * Finds the element that appears only once using a HashMap.
     * <p>
     * Use HashMap if only positive integers are given in an array.
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int usingHashMap(int[] array) {

        // Stores each number and its frequency
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of every element
        for (int i : array) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        // Find the element whose frequency is 1
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return -1 if no unique element exists
        return -1;
    }

    /**
     * Finds the element that appears only once using XOR.
     * <p>
     * XOR Properties:
     * a ^ a = 0
     * a ^ 0 = a
     * Duplicate elements cancel each other out,
     * leaving only the unique element.
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int usingXor(int[] array) {

        // Stores cumulative XOR of all elements
        int xor = 0;

        // XOR every element in the array
        for (int i : array) {
            xor = xor ^ i;
        }

        // Remaining value is the single occurring number
        return xor;
    }
}