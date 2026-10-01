package MathsForDSA;

public class Factorial {
    public static void main(String[] args){

        int num = 10;

        System.out.println(bruteForceFactorial(num));
        System.out.println(optimalFactorial(num));
    }
    public static int bruteForceFactorial(int num){
        if(num < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int ans = 1;
        for(int i = 2; i <= num; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static int optimalFactorial(int num){
        if(num < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if(num <= 1){
            return 1;
        }
        return num * optimalFactorial(num - 1);
    }
}
