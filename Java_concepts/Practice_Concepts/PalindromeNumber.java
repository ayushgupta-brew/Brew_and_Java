package Practice_Concepts;

// to reverse a number we multiply the digit with 10 and add it to the new variable

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // input user

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number ");
        int number = sc.nextInt();

        isPalindromeNo(number);

        sc.close();
    }

    // isPalindromeNo()

    public static void isPalindromeNo(int number){

        // declare variable
        int originalnumber = number;
        int result = 0;

        // condition to  reverse the number
        while(number != 0){
            int digit = number % 10;
            result = result * 10 + digit;  // reverse
            number = number / 10;
        }

        // condition to check palindrome number
        if (originalnumber == result) System.out.println("Palindrome Number");

        else System.out.println("Not Palindrome Number");
    }
}
