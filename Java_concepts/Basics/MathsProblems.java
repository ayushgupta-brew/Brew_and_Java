package Basics;

import java.util.Scanner;

public class MathsProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Hypotenuse problem
        System.out.println("Enter the two vales a and b ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("Hypotenuse value is:" +" "+ c);

        // Circumference / area / volume
        double Circumference , area , volume;

        System.out.println("Enter the radius value ");
        double radius  = sc.nextDouble();

        Circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius , 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius , 3);

        System.out.println("\nCircumference is: " + Math.floor(Circumference) + "\n area is:" + Math.floor(area) + " \n volume is: " + Math.floor(volume));

        sc.close();
    }
}
