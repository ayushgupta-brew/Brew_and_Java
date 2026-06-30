package Strings;

public class FrequencyArray {
    public static void main(String[] args) {

        String s = "CHARACTER";
        int[] freq1 = new int[26];
        characterFrequency(s , freq1);
        char j = s.charAt(0);

        for (int i = 0 ; i<freq1.length ; i++){
        char ans = (char) (i + 'A');

            if(freq1[i] > 0 && ans > j){
            System.out.println(ans  + " " + freq1[i]);
            }
        }

        int[] num = {1 , 2  ,1 , 3 , 4 , 4 , 4 , 5 , 5 , 6};
        int[] freq2 = new int[9];
        numberFrequency(num , freq2);

        for(int i = 0 ; i< freq2.length ; i++){
            if(freq2[i] > 0){
                System.out.println(i + " -> " + freq2[i]);
            }
        }

        String s2 = "cHaRacTER";
        int[] freq3 = new int[52];
        characterSensitiveFrequency(s2 , freq3);

        for(int i = 0 ; i<52 ; i++){
            if (freq3[i] > 0) {
                char ch;
                if (i < 26) {
                    ch = (char) (i + 'A');
                } else {
                    ch = (char) (i - 26 + 'a');
                }
                System.out.println(ch + " -> " + freq3[i]);
            }
        }

    }

    public static void characterFrequency(String s , int[] freq) {

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            freq[ch - 'A']++;
        }
    }
    public static void numberFrequency(int[] num , int[] freq) {

        for(int i : num){

            freq[i]++;
        }
    }

    public static void characterSensitiveFrequency(String s , int[] freq){

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                freq[ch - 'A']++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                freq[ch - 'a' + 26]++;
            }
        }
    }
}
