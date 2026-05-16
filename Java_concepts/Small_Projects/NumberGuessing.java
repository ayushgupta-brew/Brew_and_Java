package Small_Projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        int min = 1 ;
        int max = 100;
        int guess;
        int attempts=0;

        int randomNumber = random.nextInt(min , max + 1);

        System.out.println("Number guessing game ✨");
        System.out.printf("Enter the number between %d-%d\n" , min , max);

        do {
            System.out.print("Enter the guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Too Low! Try again");
            }
            else if (guess > randomNumber){
                System.out.println("Too High! Try again");
            }
            else{
                System.out.printf("Correct! The  guess number %d is %d \n", guess , randomNumber);
                System.out.print("Number of attempts is: " + attempts);
            }
        }while(guess != randomNumber);

        sc.close();
    }
}
