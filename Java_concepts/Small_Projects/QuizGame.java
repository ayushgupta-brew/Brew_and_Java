package Small_Projects;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {"What is the capital of France ?", "Which planet is known as the Red Planet ?", "Who painted the Mona Lisa ?", "In what year did World War II begin ?", "Who was the first woman to win a Nobel Prize ?"};

        String[][] options = {{"1. Paris", "2. Rome"},
                {"1. Mars", "2. Venus"},
                {"1. Pablo Picasso", "2. Leonardo da Vinci"},
                {"1. 1945", "2. 1939"},
                {"1. Rosalind Franklin", "2. Marie Curie"}};

        int[] answers = {1 , 1 , 2 , 2 , 2};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz Game! ");

        for (int i = 0 ; i< questions.length ; i++){
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct ! ");
                score++;
            }
            else{
                System.out.println("Incorrect ! ");
            }
        }

        System.out.print("Your Final Score is: " + score);

        sc.close();
    }
}
