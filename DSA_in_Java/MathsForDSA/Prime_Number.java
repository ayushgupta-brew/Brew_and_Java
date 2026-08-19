package MathsForDSA;

public class Prime_Number {
    public static void main(String[] args){

        int number = 10;
        System.out.println(bruteForceApproach(number));
        System.out.println(optimalApproach(number));
    }
    public static boolean bruteForceApproach(int n){
        if(n <= 1){
            return false;
        }
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count == 2;
    }
    public static boolean optimalApproach(int n){
        if (n <= 1){
            return false;
        }
        int count = 0;
        for(int i = 1; i*i<= n; i++){
            if(n % i == 0){
                count++;

                if(n / i != i){
                    count++;
                }
            }
        }
        return count == 2;
    }
}
