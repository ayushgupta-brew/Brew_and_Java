package Strings;

import java.util.*;
public class WordsCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;
        boolean isWord = false;

        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) != ' ' && !isWord){
                count++;
                isWord = true;
            }
            else if (s.charAt(i) == ' ') {
                isWord = false;
            }
        }
        System.out.println(count);
    }
}
