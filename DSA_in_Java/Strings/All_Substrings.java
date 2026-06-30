package Strings;

import java.util.Scanner;

public class All_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
//        substrings(name);
        System.out.print(sumOfSubstring(name));
    }

    public static void substrings(String name) {
        for (int j = 0; j < name.length(); j++) {
            for (int i = j + 1; i <= name.length(); i++) {
                System.out.print(name.substring(j, i) + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfSubstring(String name) {
        int sum = 0;

        for (int j = 0; j < name.length(); j++) {
            for (int i = j + 1; i <= name.length(); i++) {
                String result = name.substring(j , i);
                sum = sum + Integer.parseInt(result);
            }
        }
        return sum;
    }
}
