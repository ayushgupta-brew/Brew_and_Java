package Small_Projects;

import java.util.Scanner;
// Declare variables

// Display Menu

// Get and process users choice

// showBalance()

// deposit()

// withdraw()

//Exit Message
public class BankingProgram {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        double balance=0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            System.out.println("Option 1 : Show Balance ");
            System.out.println("Option 3 : Deposit ");
            System.out.println("Option 3 : Withdraw ");
            System.out.println("Option 4 : Exit ");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -=  withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Error type numbers from (1-4)");
            }
        }
    }


    static void showBalance(double balance){
        System.out.printf("$%.2f\n" , balance);
    }

    static double deposit(){
        double amount;

        System.out.println("Enter an amount to be deposited");
        amount = sc.nextDouble();
        if (amount <= 0){
            System.out.println("Amount cannot be less then 0 or 0");
            return 0;
        }
        else return amount;
    }

    static double withdraw(double balance){
        double amount;

        System.out.println("Enter an amount to be withdraw");
        amount = sc.nextDouble();
        if (amount > balance){
            System.out.println("Insufficient Balance");
            return 0;
        }
        else if (amount <= 0){
            System.out.println("Amount cannot be less then 0 or 0");
            return  0;
        }
        else return amount ;
    }

}
