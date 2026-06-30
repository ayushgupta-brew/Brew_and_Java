package Logic_Building_Programs;
// leap year formula -> divisible by 400 and 4 and divisible by 100 !=0

import java.util.Scanner;
public class Leap_year_orNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int leap_year = sc.nextInt();

        if((leap_year % 400 == 0) || (leap_year % 4 == 0) && (leap_year % 100 != 0))
            System.out.print("Leap Year");
        else
            System.out.print("Not a Leap Year");

    }
}
