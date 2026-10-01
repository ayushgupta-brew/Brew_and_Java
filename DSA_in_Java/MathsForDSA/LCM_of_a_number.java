package MathsForDSA;

public class LCM_of_a_number {
    public static void main(String[] args){

        int n1 = 3, n2 = 5;

        System.out.println(LCM(n1, n2));
    }
    public static int LCM(int n1, int n2){
        if(n1 == 0 || n2 == 0){
            return 0;
        }
        return (Math.abs(n1) / GCD(n1, n2)) * Math.abs(n2);
    }
    public static int GCD(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        return GCD(n2, n1 % n2);
    }
}
