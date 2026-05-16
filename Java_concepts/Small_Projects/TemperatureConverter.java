package Small_Projects;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        String unit = sc.next().toUpperCase();

        // Using ternary operator
        double newTemp = unit.equals("C") ? (temp - 32) *5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.2f degree %s " ,newTemp , unit);

        sc.close();
    }
}
