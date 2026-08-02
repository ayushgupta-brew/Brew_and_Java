package Binary_Search.BS_on_Answer;

import java.util.Arrays;

public class Capacity_To_Ship_Packages_Within_D_Days {

    public static void main(String[] args) {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;

        System.out.println(bruteForceApproach(weights, days));
        System.out.println(optimalApproach(weights, days));
    }

    /*
     * Brute force approach:
     * Try every possible ship capacity starting from the heaviest package
     * up to the sum of all packages.
     *
     * For each capacity, calculate how many days are needed.
     * The first capacity that can ship all packages within 'days' is the answer.
     *
     * Time Complexity:
     * - Capacity range can be from maxWeight to sumWeights
     * - For each capacity, we scan the array once in daysNeeded()
     * - Worst case: O((sumWeights - maxWeight) * N)
     *
     * Space Complexity:
     * - O(1)
     */
    public static int bruteForceApproach(int[] weights, int days) {
        // Maximum possible capacity: ship all packages in one day
        int maxWeightSum = Arrays.stream(weights).sum();

        // Minimum possible capacity: at least the heaviest package
        int maxWeight = Integer.MIN_VALUE;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
        }

        // Check every capacity from minimum feasible to maximum possible
        for (int capacity = maxWeight; capacity <= maxWeightSum; capacity++) {
            int needed = daysNeeded(weights, capacity);

            // If this capacity works, it is the minimum one because we are checking in increasing order
            if (needed <= days) {
                return capacity;
            }
        }

        return maxWeight; // fallback, practically not needed
    }

    /*
     * Optimal approach using Binary Search on Answer:
     *
     * Observation:
     * - If a capacity works, then any larger capacity will also work.
     * - This monotonic property allows binary search.
     *
     * Search space:
     * - low = max single package weight
     * - high = sum of all weights
     *
     * Time Complexity:
     * - Binary search takes O(log(sumWeights - maxWeight))
     * - Each step calls daysNeeded(), which is O(N)
     * - Total: O(N * log(sumWeights - maxWeight))
     *
     * Space Complexity:
     * - O(1)
     */
    public static int optimalApproach(int[] weights, int days) {
        int maxWeightSum = Arrays.stream(weights).sum();

        // Minimum feasible capacity must be at least the heaviest package
        int maxWeight = Integer.MIN_VALUE;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
        }

        int left = maxWeight, right = maxWeightSum;

        // Binary search for the minimum capacity that works
        while (left < right) {
            int mid = left + (right - left) / 2;

            int needed = daysNeeded(weights, mid);

            // If mid capacity works, try to find a smaller valid capacity
            if (needed <= days) {
                right = mid;
            } else {
                // If mid is not enough, increase capacity
                left = mid + 1;
            }
        }

        return left; // or right, both are same here
    }

    /*
     * Helper function:
     * Returns how many days are needed to ship all packages
     * with the given ship capacity.
     *
     * Greedy idea:
     * - Keep adding packages to the current day
     * - If adding one package exceeds capacity, start a new day
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    private static int daysNeeded(int[] weights, int capacity) {
        int days = 1; // start with day 1
        int currentLoadCapacity = 0;

        for (int weight : weights) {
            // If current package doesn't fit in today's remaining capacity,
            // move it to the next day
            if (currentLoadCapacity + weight > capacity) {
                days++;
                currentLoadCapacity = weight;
            } else {
                currentLoadCapacity += weight;
            }
        }

        return days;
    }
}