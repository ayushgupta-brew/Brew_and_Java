package Practice_Concepts;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string ");
        String name = sc.nextLine();
        name = name.toLowerCase();

        reverse1(name);
        reverse2(name);

        sc.close();
    }

    public static void reverse1(String n){

        StringBuilder sb = new StringBuilder(n);

        String rev = String.valueOf(sb.reverse());  // String.valueOf() gives the value od string of the object

        System.out.println(rev);
    }

    public static void reverse2(String n){

        String rev = "";

        for (int i = n.length() -1; i >= 0; i--) {
            rev = rev + n.charAt(i);
        }
        System.out.println(rev);
    }
}
