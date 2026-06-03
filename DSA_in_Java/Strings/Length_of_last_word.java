package Strings;

import java.util.Scanner;

public class Length_of_last_word {
    static void main(String[] args){

        // Read input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string of words");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        //  Print the length of the last word
        System.out.println("answer :" + result);

        sc.close();
    }

    public static int lengthOfLastWord(String s){

        // Start from the last character of the string
        int tracker = s.length() - 1;

        // Skip trailing spaces
        while(tracker >= 0 && s.charAt(tracker) == ' '){
            tracker--;
        }

        // Stores the length of the last word
        int length=0;

        // Count characters until a space or beginning of string is reached
        while(tracker >= 0 && s.charAt(tracker) != ' '){
            length++;
            tracker--;
        }
        return length;
    }
}