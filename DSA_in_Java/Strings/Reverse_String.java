package Strings;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String original = sc.next();
        String reverse = "";

        for(int i = original.length()-1 ; i>= 0 ; i--){ // string ka logic
            reverse += original.charAt(i);
        }
        System.out.println(reverse.toLowerCase());

        StringBuilder sb = new StringBuilder("ayush");
        StringBuilder reverse1 = new StringBuilder();

        for(int i = sb.length()-1 ; i>= 0 ; i--){ // StringBuilder ka logic
           reverse1.append(sb.charAt(i));
        }
        System.out.println(reverse1);


        /*for(int i = 0 ; i < sb.length()/2; i++){  faster logic
            int start = i;
            int end = sb.length() - 1 - i;

            // Swap characters
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
        }*/

    }
}
