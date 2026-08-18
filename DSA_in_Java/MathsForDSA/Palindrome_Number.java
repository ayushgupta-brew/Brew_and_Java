package MathsForDSA;

public class Palindrome_Number {
    public static void main(String[] args){

        int number = 122;
        System.out.println(optimalApproach(number));
    }
    public static boolean optimalApproach(int number){

        return number == reverseANumber(number);
    }
    private static int reverseANumber(int number){
        int n = number;
        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse;
    }
}
