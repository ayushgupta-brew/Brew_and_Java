package MathsForDSA;

public class Reverse_a_Number {
    public static void main(String[] args){
        int number = 10400;
        System.out.println(reverseDigitWithOutTrailingZeros(number));
    }
    public static int reverseDigitWithOutTrailingZeros(int number){
        int reverse = 0;
        int n = number;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }
}
