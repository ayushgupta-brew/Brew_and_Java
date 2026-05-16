package Logic_Building_Programs;

import java.util.Scanner;
public class Prime_inRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        boolean found = false;

        for(int num = n1 ; num <= n2 ; num++){

            if(num < 2)
                continue;

            boolean isPrime = true;

            for(int i = 2 ; i * i <= num ; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(num + " ");
                found = true;
            }
        }

        if(!found)
            System.out.print("No prime numbers in this range");
    }
}
