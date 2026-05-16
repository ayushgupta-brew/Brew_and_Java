package Logic_Building_Programs;

import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = 0;
        int rem ;

        while(num != 0){
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.print(reverse);
    }
}
