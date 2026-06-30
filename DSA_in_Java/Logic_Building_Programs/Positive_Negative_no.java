package Logic_Building_Programs;

import java.util.Scanner;

public class Positive_Negative_no {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        if(n == 0) {
            System.out.print(n);
        }
        else {
            String ans = (n > 0) ? "Positive" : "Negative";
            System.out.print(ans);
        }
    }
}
