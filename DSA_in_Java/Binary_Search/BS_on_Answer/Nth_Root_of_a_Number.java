package Binary_Search.BS_on_Answer;

public class Nth_Root_of_a_Number {

    public static void main(String[] args) {
        int N = 3;
        int M = 27;

        // Brute force: try every possible base from 1 to M
        System.out.println(bruteForceApproach(N, M));

        // Optimal approach: binary search on the answer
        System.out.println(optimalApproach(N, M));
    }

    // ------------------------------------------------------------
    // BRUTE FORCE APPROACH
    // Time Complexity: O(M * log N) if using Math.pow
    // Space Complexity: O(1)
    //
    // Interview idea:
    // - Check every number from 1 to M
    // - If its Nth power equals M, that number is the Nth root
    // - Stop early once the power becomes greater than M
    // ------------------------------------------------------------
    public static int bruteForceApproach(int N, int M) {

        // Invalid case: root degree cannot be 0
        if (N == 0) {
            return -1;
        }

        for (int i = 1; i <= M; i++) {

            // Use long to reduce overflow risk for larger values
            long power = (long) Math.pow(i, N);

            // Found exact root
            if (power == M) {
                return i;
            }

            // Once power crosses M, no need to continue further
            if (power > M) {
                break;
            }
        }

        // No integer Nth root exists
        return -1;
    }

    // ------------------------------------------------------------
    // OPTIMAL APPROACH USING BINARY SEARCH
    // Time Complexity: O(log M * N)
    // Space Complexity: O(1)
    //
    // Interview idea:
    // - The answer lies in the range [0, M]
    // - For a chosen mid, compute mid^N carefully
    // - If mid^N == M => answer found
    // - If mid^N < M => move right
    // - If mid^N > M => move left
    //
    // Why binary search works:
    // - As mid increases, mid^N increases monotonically
    // ------------------------------------------------------------
    public static int optimalApproach(int N, int M) {

        int left = 0, right = M;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Compute mid^N safely using repeated multiplication
            // This avoids floating-point precision issues from Math.pow
            long ans = 1;

            for (int i = 0; i < N; i++) {
                ans *= mid;

                // Stop early if the value already exceeds M
                // This prevents overflow and saves time
                if (ans > M) {
                    break;
                }
            }

            // Exact match found
            if (ans == M) {
                return mid;
            }

            // If mid^N is smaller than M, search on the right side
            if (ans < M) {
                left = mid + 1;
            }
            // If mid^N is greater than M, search on the left side
            else {
                right = mid - 1;
            }
        }

        // No integer root exists
        return -1;
    }
}