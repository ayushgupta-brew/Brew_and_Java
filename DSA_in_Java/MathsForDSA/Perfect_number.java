package MathsForDSA;

public class Perfect_number {
    public static void main(String[] args){
        int n = 28;

        System.out.println(checkPerfectNumber(n));
    }
    public static boolean checkPerfectNumber(int n){

        int num = n;
        int sum = 1;

        for(int i = 2; i * i < num; i++){
            if(num % i == 0){
                if(i * i != n){
                    sum = sum + i + n/i;
                }
                else{
                    sum = sum + i;
                }
            }
        }
        return sum == num && num != 1;
    }
}