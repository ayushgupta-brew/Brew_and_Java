package Small_Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain;

        do {
        System.out.print("Enter your move (rock , paper , scissors): ");
        playerChoice = sc.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Invalid choice! ");
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer Choice: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("Its an Tie! ");
        }
//        else if () {}    -  here we will give the statements
        else {
            System.out.println("You Lose");
        }

        System.out.print("Play Again (yes / no): ");

        playAgain = sc.nextLine().toLowerCase();

    }while(playAgain.equals("yes"));

        sc.close();
    }
}
