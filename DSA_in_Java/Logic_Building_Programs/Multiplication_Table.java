package Logic_Building_Programs;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1 ; i<= 10 ; i++){
            int ans = n * i;
            System.out.println("multiplication Table for number: " + n +" * "+ i + " = " + ans);
        }
        sc.close();
    }
}
