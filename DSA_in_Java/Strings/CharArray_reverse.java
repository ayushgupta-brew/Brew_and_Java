package Strings;

public class CharArray_reverse {
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for (char i : a) {
            System.out.print(i + " ");
        }
    }
}
