package Strings;

import java.util.Scanner;
public class Change_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.print(change(s1));
    }
    public static String change(String c){
        int start = 0;

        if((c.charAt(start)>='a') && (c.charAt(start)<='z')){
            return c.toLowerCase();
        }
        else {
            return c.toUpperCase();
        }
    }
}
