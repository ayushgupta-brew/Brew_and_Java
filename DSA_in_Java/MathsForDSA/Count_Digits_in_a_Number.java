package MathsForDSA;

public class Count_Digits_in_a_Number {
    public static void main(String[] args) {
        int N = 7789;
        System.out.println(optimalApproach(N));
    }
    public static int optimalApproach(int N){
        int count = 0;
        int n = N;

        while(n > 0){
            int digit = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }
}
