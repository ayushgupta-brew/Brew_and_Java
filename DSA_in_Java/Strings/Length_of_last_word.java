package Strings;

import java.util.Scanner;

public class Length_of_last_word {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string of words");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);
        System.out.println("answer :" + result);
    }

    public static int lengthOfLastWord(String s){

        int tracker = s.length() - 1;

        while(tracker >= 0 && s.charAt(tracker) == ' '){
            tracker--;
        }

        int length=0;
        while(tracker >= 0 && s.charAt(tracker) != ' '){
            length++;
            tracker--;
        }
        return length;
    }
}