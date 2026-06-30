package Basics;

import java.util.Random;

public class RandomNumber{
    public static void main(String[] args) {
        Random random  = new Random(); // random method to generate random numbers or any data type randomly

        int number1;
        int number2;
        int number3;
        boolean coin;

        number1 = random.nextInt(50 , 101);
        number2 = random.nextInt(1 , 101);
        number3 = random.nextInt(1 , 101);
        coin = random.nextBoolean();

        if (coin) System.out.println("Heads");
        else System.out.println("Tails");

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        
    }
}