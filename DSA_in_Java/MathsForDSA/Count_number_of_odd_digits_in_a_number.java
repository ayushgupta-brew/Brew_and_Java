package MathsForDSA;

public class Count_number_of_odd_digits_in_a_number {
    public static void main(String[] args){
        int n = 5;
        System.out.println(countOddDigits(n));
    }
    public static int countOddDigits(int n){

        int num = n;
        int count = 0;

        if(n == 0){
            return 0;
        }

        while(num > 0){
            int digit = num % 10;

            if(digit % 2 != 0){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
