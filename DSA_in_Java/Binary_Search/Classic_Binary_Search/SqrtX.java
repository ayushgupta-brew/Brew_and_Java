package Binary_Search;

public class SqrtX {
    public static void main(String[] args) {

        int x = 8;

        // Brute force approach: simple but slow
        int bruteAns = bruteApproach(x);
        System.out.println("Brute Force Answer: " + bruteAns);

        // Optimal approach: efficient binary search
        int optimalAns = optimalApproach(x);
        System.out.println("Optimal Answer: " + optimalAns);
    }

    // Brute Force Approach
    // Idea:
    // Try every number from 1 to x and check which one is the largest number
    // whose square is <= x.
    //
    // Time Complexity: O(sqrt(x))
    // Space Complexity: O(1)
    public static int bruteApproach(int x) {

        // Handle small values directly
        if (x < 2) {
            return x;
        }

        int ans = 0;

        // We only need to check up to x / 2 for x >= 2
        // because square root of x will always be <= x/2 for larger values
        for (int i = 1; i <= x / 2; i++) {
            if ((long) i * i <= x) {
                ans = i; // keep updating the valid integer square root
            } else {
                break; // once square exceeds x, no need to continue
            }
        }

        return ans;
    }

    // Optimal Approach using Binary Search
    // Idea:
    // Since the square of numbers increases as the number increases,
    // we can use binary search to find the floor of sqrt(x).
    //
    // Time Complexity: O(log x)
    // Space Complexity: O(1)
    public static int optimalApproach(int x) {

        // For 0 and 1, the answer is the number itself
        if (x < 2) {
            return x;
        }

        long left = 1, right = x / 2;

        // Binary search on the answer space
        while (left <= right) {

            // Safe mid-calculation to avoid overflow
            long mid = left + (right - left) / 2;

            // Use long to avoid overflow when mid * mid becomes large
            long square = mid * mid;

            // Exact square root found
            if (square == x) {
                return (int) mid;
            }
            // Mid is too small, so search in the right half
            else if (square < x) {
                left = mid + 1;
            }
            // Mid is too large, so search in the left half
            else {
                right = mid - 1;
            }
        }

        // When loop ends, right points to the floor of sqrt(x)
        return (int) right;
    }
}