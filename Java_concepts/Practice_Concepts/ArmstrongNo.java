package Practice_Concepts;

//  Armstrong Number -> 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number ");
        int number = sc.nextInt();

        isArmstrong(number);

        sc.close();
    }

    public static void isArmstrong(int number) {

        int originalnumber = number;
        int sum = 0;

        for (int i = number; i > 0 ; i = i / 10) {
            int digit = i % 10;
            sum += Math.pow(digit , 3);
        }

        if (originalnumber == sum) System.out.println("Armstrong");

        else System.out.println("Not Armstrong");
    }
}
