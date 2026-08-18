package MathsForDSA;

public class Armstrong_Number {
    public static void main(String[] args){

        int number = 153;
        System.out.println(bruteApproach(number));
        System.out.println(optimalApproach(number));
    }
    public static boolean bruteApproach(int number){

        int n = number;
        int pow = countDigit(number);
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = (int) (sum + Math.pow(digit , pow));
            n = n / 10;
        }
        return sum == number;
    }
    private static int countDigit(int number){
        int count = 0;
        int n = number;

        while(n > 0){
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static boolean optimalApproach(int number){
        int n = number;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + power(digit, number);
            n = n / 10;
        }
        return sum == number;
    }
    private static int power(int digit, int number){
        int pow = 1;
        int numberToPower = countDigit(number);
        for (int i = 0; i < numberToPower; i++) {
            pow = pow * digit;
        }
        return pow;
    }
}
