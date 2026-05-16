package Strings;

import java.util.Arrays;

public class Reverse_EachWord {
    public static void main(String[] args) {
        String sentence = "Hello World I am Ayush";

        char[] arr = sentence.toCharArray();
        int i = 0;

        for (int j = 0; j <= arr.length; j++) {

            // word j or string j
            if (j == arr.length || arr[j] == ' ') {
                reverse(arr, i, j - 1);
                i = j + 1;
            }
        }

        String ans = new String(arr);
        System.out.print(ans);
    }

    private static void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
