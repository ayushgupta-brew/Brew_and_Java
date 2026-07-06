package Strings.Sliding_Window;

import java.util.*;

public class All_Substring_In_A_String {

    public static void main(String[] args) {

        // Input string in which we need to find all anagrams
        String s = "cbaebabacd";

        // Pattern whose anagrams we want to find
        String p = "abc";

        // Get all starting indices of anagrams
        List<Integer> result = findAnagram(s, p);

        // Print the result
        result.forEach(index -> System.out.print(index + " "));
    }

    static List<Integer> findAnagram(String s, String p) {

        // Stores the starting indices of all anagrams
        List<Integer> answer = new ArrayList<>();

        // Edge case: If pattern is longer than the string,
        // it is impossible to have any anagram.
        if (s.length() < p.length()) {
            return answer;
        }

        // Frequency array for the pattern
        int[] pFrequency = new int[26];

        // Frequency array for the current sliding window
        int[] windowFrequency = new int[26];

        // Build the frequency map of the pattern
        for (char c : p.toCharArray()) {
            pFrequency[c - 'a']++;
        }

        // Left pointer of the sliding window
        int left = 0;

        // Expand the window by moving the right pointer
        for (int right = 0; right < s.length(); right++) {

            // Include the current character in the window
            windowFrequency[s.charAt(right) - 'a']++;

            // If the window becomes larger than the pattern,
            // remove the leftmost character and shrink the window.
            if (right - left + 1 > p.length()) {
                windowFrequency[s.charAt(left) - 'a']--;
                left++;
            }

            // Once the window size equals the pattern length,
            // compare both frequency arrays.
            if (right - left + 1 == p.length()) {

                // If frequencies match, the current window is an anagram.
                if (Arrays.equals(windowFrequency, pFrequency)) {
                    answer.add(left);
                }
            }
        }

        // Return all starting indices of anagrams
        return answer;
    }
}