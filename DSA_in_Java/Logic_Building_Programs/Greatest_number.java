package Logic_Building_Programs;

import java.util.Scanner;
public class Greatest_number {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 == n2){
            System.out.print("Numbers are equal");
            return;
        }

        String ans = (n1 > n2) ? n1 + " is great" : n2 + " is great";

        System.out.print(ans);
    }
}
