package Strings;

import java.util.Scanner;
public class Palindrome_No {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

//        if(name.equals(palindrome1(name))){
//            System.out.print("Palindrome");
//        }
//        else{
//            System.out.print("Not Palindrome");
//        }
        if(palindrome2(name)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
    public static String palindrome1(String name){

        StringBuilder reverse = new StringBuilder();
        for(int i = name.length()-1 ; i >= 0 ; i--){
            reverse.append(name.charAt(i));
        }
        return reverse.toString();
    }
    public static boolean palindrome2(String name){
        int start = 0;
        int end = name.length()-1;
        while(start < end){
            if(name.charAt(start) != name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
