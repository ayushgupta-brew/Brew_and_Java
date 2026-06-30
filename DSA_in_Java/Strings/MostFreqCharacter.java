package Strings;

public class MostFreqCharacter {
    public static void main(String[] args) {

        String s = "character";

        char ans = countFreqUsingFreqArray(s);
        System.out.println(ans);

    }
    public static char countFreqUsingFreqArray(String s){

        int max = 0;
        char ans = s.charAt(0);

        int[] freq = new int[26];

        for(int i = 0 ; i<s.length() ; i++){
//            char ch = s.charAt(i);
//            int index = ch-97;

            freq[s.charAt(i)- 'a']++;
        }

        for(int i = 0 ; i<26 ; i++){
            if(freq[i] > max){
                max = freq[i];
                ans = (char) (i + 'a');
            }
        }
        return ans;
    }
}
