package Small_Projects;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        double weight;
        double newWeight;

        System.out.println("Weight Conversion Program");
        System.out.println("1: covert lbs to kgs");
        System.out.println("2: covert kgs to lbs");

        System.out.println("choose an option from above: ");
        int choice = sc.nextInt();

        // using If statements
        if (choice == 1) {
            System.out.println("Enter the Weight in lbs");
             weight = sc.nextDouble();
             newWeight = weight * 0.453592;
            System.out.println("New weight in kgs is: " + newWeight);
        }
        else if(choice == 2) {
            System.out.println("Enter the Weight in kgs");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("New weight in lbs is :" + newWeight);
        }
        else {
            System.out.println("Wrong choice . Please select the options either 1 or 2 ");
        }

        //using Switch case statements
        switch (choice){
            case 1:
                System.out.println("Enter the Weight in lbs");
             weight = sc.nextDouble();
             newWeight = weight * 0.453592;
             System.out.println("New weight in kgs is: " + newWeight);
            break ;
            case 2:
                System.out.println("Enter the Weight in kgs");
             weight = sc.nextDouble();
             newWeight = weight * 2.20462;
             System.out.println("New weight in lbs is :" + newWeight);
            break ;

            default:
                System.out.println("Wrong choice . Please select the options either 1 or 2 ");
        }

        sc.close();
    }
}
