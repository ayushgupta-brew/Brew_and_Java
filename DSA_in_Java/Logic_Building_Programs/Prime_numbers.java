package Logic_Building_Programs;

import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <=1){
            System.out.print("Number is not prime");
            return;
        }

        boolean isPrime = true;

        for(int i = 2 ; i< n/2 ; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.print("Prime");
        else
            System.out.print("Not Prime");


    }
}
//        int i;
//        for (i = 2; i * i <= n; i++) {
//            if (n % i == 0)
//                break;
//        }
//
//        if (i * i > n)
//            System.out.println("Prime");
//        else
//            System.out.println("Not Prime");
