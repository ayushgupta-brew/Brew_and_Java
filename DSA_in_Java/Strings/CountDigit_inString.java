package Strings;

public class CountDigit_inString {
    public static void main(String[] args) {
        int s1 = 203267;
        System.out.print(countDigit(s1));
    }

    public static int countDigit(int a) {
        String ans = Integer.toString(a);
        return ans.length();
    }
}
