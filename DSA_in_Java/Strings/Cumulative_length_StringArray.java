package Strings;

import java.util.Scanner;

public class Cumulative_length_StringArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] a = new String[n];
        int l = 0;

        for(int i = 0 ; i<a.length; i++){
            a[i] = sc.nextLine();
            l = l+ a[i].length();
        }
        System.out.println("cumulative (combined) length of all String in array: " + l);
        sc.close();
    }
}
