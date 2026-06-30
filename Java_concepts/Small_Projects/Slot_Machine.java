package Small_Projects;

import java.util.Random;
import java.util.Scanner;

public class Slot_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain = "Y";

        System.out.println("Welcome to Java Slot Machine Game! ");
        System.out.println("symbols: 🍒 🍉 🥭 🔔 ⭐");

        while (balance > 0) {
            System.out.println("Current Balance: $" + balance);
            System.out.print("Place your Bet amount");
            bet = sc.nextInt();
            sc.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient funds!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance = balance - bet;
            }

            System.out.println("spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You Won $" + payout);
                balance = balance + payout;
            } else {
                System.out.println("Sorry u lost the round! ");
            }

            System.out.println("Do You Want To Play Again (Y / N)");
            playAgain = sc.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
            break;
            }
        }
        System.out.println("Thanks For Playing");

        sc.close();
    }
    static String[] spinRow(){

        String[] symbols = {"🍒" ,  "🍉" ,  "🥭" , "🔔" ,  "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | " , row));
    }
    static int getPayout(String[] row , int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🥭" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        return 0;
    }
}
