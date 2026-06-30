package Practice_Concepts;

// Palindrome -> reverse of string means string = madam , reverse = madam

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String ");
        String name = sc.nextLine();

        name = name.toLowerCase();

        if (isPalindrome(name)) System.out.println("Palindrome");

        else System.out.println("Not Palindrome");

        sc.close();
    }

    public static boolean isPalindrome(String n){
        int l = n.length();
        int start = 0;
        int end = l-1;

        for (int i = 0; i < l; i++) {
            if(n.charAt(start) != n.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
