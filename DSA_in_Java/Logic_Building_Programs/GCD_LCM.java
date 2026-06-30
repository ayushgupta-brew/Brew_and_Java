package Logic_Building_Programs;

import java.util.*;
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a , b));
        System.out.println(recursiveGcd(a , b));
        System.out.println(lcm(a , b));
    }
    public static int gcd(int n1 , int n2){
        for(int i = Math.min(n1 , n2) ; i>0 ; i--){
            if((n1 % i == 0) && (n2 % i == 0)){
                return i;
            }
        }
        return 1;
    }

    public static int recursiveGcd(int n1 , int n2){
        if(n1 == 0){
            return n2;
        }
        if(n1 > n2){
            return  gcd(n1 - n2 , n2);
        }
        else{
            return  gcd(n1 , n2 - n1);
        }
    }

    public static int lcm(int n1 , int n2){  // lcm formula -> a * b / gcd(a , b)
        return (n1 * n2) / gcd(n1 ,n2);
    }
}
