package Strings.Sliding_Window;

import java.util.*;

public class All_Substring_In_A_String {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagram(s, p);

        System.out.print(result);
    }
    static List<Integer> findAnagram(String s , String p){
        List<Integer> answer = new ArrayList<>();

        if(s.length() < p.length()){
            return answer;
        }

        int[] pFrequency = new int[26];
        int[] windowFrequency = new int[26];

        for(char pCharacter : p.toCharArray()){
            pFrequency[pCharacter - 'a']++;
        }
        int left = 0;
        for(int right = 0 ; right < s.length(); right++){
            windowFrequency[s.charAt(right) - 'a']++;

            if(right - left + 1 > p.length()){
                windowFrequency[s.charAt(left) - 'a']--;
                left++;
            }
            if(right - left + 1 == p.length()){
                if(Arrays.equals(windowFrequency, pFrequency)){
                    answer.add(left);
                }
            }
        }
        return answer;
    }
}
