package Binary_Search.BS_on_Answer;

public class Koko_Eating_Banana {

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println("Brute Force Answer : " + bruteForceApproach(piles, h));
        System.out.println("Optimal Answer     : " + optimalApproach(piles, h));
    }

    // ============================================================
    // BRUTE FORCE APPROACH
    // ------------------------------------------------------------
    // Idea:
    // Try every possible eating speed from 1 to maximum pile size.
    // For each speed, calculate total hours required.
    // The first speed that finishes within h hours is the answer.
    //
    // Time Complexity : O(maxPile × n)
    // Space Complexity: O(1)
    // ============================================================
    public static int bruteForceApproach(int[] piles, int h) {

        int maxPile = findMaximumPile(piles);

        for (int speed = 1; speed <= maxPile; speed++) {

            long totalHours = calculateHoursBrute(piles, speed);

            if (totalHours <= h) {
                return speed;
            }
        }

        return -1;
    }

    // ------------------------------------------------------------
    // Helper Method (Brute Force)
    //
    // Calculates total hours required at a given eating speed.
    //
    // Formula:
    // Hours = Ceiling(pile / speed)
    //
    // Ceiling Division:
    // (pile + speed - 1) / speed
    //
    // Example:
    // pile = 7
    // speed = 3
    //
    // 7 / 3 = 2.33
    // Ceiling = 3 hours
    // ------------------------------------------------------------
    private static long calculateHoursBrute(int[] piles, int speed) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1L) / speed;
        }

        return hours;
    }

    // ============================================================
    // OPTIMAL APPROACH (Binary Search on Answer)
    // ------------------------------------------------------------
    // Search Space:
    // Minimum Speed = 1
    // Maximum Speed = Largest Pile
    //
    // Monotonic Property:
    //
    // Speed ↑  => Hours ↓
    //
    // If Koko can finish in h hours at speed X,
    // then she can also finish at every speed > X.
    //
    // Therefore Binary Search can be applied.
    //
    // Time Complexity : O(n × log(maxPile))
    // Space Complexity: O(1)
    // ============================================================
    public static int optimalApproach(int[] piles, int h) {

        int left = 1;
        int right = findMaximumPile(piles);

        int answer = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long totalHours = calculateHoursOptimal(piles, mid);

            // Current speed works.
            // Try finding an even smaller valid speed.
            if (totalHours <= h) {

                answer = mid;
                right = mid - 1;
            }

            // Current speed is too slow.
            // Increase the eating speed.
            else {
                left = mid + 1;
            }
        }

        return answer;
    }

    // ------------------------------------------------------------
    // Helper Method (Optimal)
    //
    // Computes total hours required for Binary Search.
    //
    // Same calculation as brute force,
    // but kept separate to make each approach independent.
    // ------------------------------------------------------------
    private static long calculateHoursOptimal(int[] piles, int speed) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1L) / speed;
        }

        return hours;
    }

    // ------------------------------------------------------------
    // Utility Method
    // Finds the largest pile.
    //
    // Maximum eating speed never needs to be greater than
    // the largest pile because Koko can finish one pile in
    // one hour at that speed.
    // ------------------------------------------------------------
    private static int findMaximumPile(int[] piles) {

        int max = Integer.MIN_VALUE;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        return max;
    }
}