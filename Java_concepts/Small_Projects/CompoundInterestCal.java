package Small_Projects;

import java.util.Scanner;

public class CompoundInterestCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double Principal = sc.nextDouble();

        System.out.print("Enter the interest rate: ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter the number the times compounded per year: ");
        int TimesCompounded = sc.nextInt();

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

       double amount = Principal * Math.pow(1+ rate / TimesCompounded , TimesCompounded * years);

        System.out.println("The total amount: " + amount);
        sc.close();
    }
}
