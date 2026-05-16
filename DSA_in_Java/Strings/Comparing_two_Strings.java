package Strings;

import java.util.Scanner;
public class Comparing_two_Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.print(compare(s1 , s2));
    }
    public static int compare(String a , String b){
        if(a.equals(b)){
            return -1;
        }
        else {
            return a.compareTo(b);
        }
    }
}
