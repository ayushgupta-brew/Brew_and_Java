package MathsForDSA;

public class Return_the_Largest_Digit_in_a_Number {
    public static void main(String[] args){

        int n = 25;
        System.out.println(largestDigit(n));
    }
    public static int largestDigit(int n){

        int num = n;
        int maxDigit = 0;

        while(num > 0){
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            num = num / 10;
        }
        return maxDigit;
    }
}
