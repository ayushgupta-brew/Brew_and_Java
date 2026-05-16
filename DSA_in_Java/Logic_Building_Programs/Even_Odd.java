package Logic_Building_Programs;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        if(n % 2 == 0)  // classic logic
//            System.out.println("Even");
//        else
//            System.out.println("Odd");

//        String result = (n % 2 == 0) ? "Even" : "Odd"; // using ternary operator
//
//        System.out.print(result);

        if((n & 1) == 0)   // because har even number ke binary ke last mai 0 ata hai .
            System.out.print("Even");
        else
            System.out.print("Odd");

    }
}
