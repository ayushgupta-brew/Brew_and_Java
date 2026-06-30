package Threads_Concurrency_Exceptions;

// Demonstrates the use of 'throw' keyword to manually throw an exception

// and how to create and use a custom exception in Java

class AyushException extends Exception{
    AyushException(String message){
        super(message);
    }
}

public class CustomException_ThrowKeyword {
    public static void main(String[] args) {

//        String s =  null;
        String s =  "Nisha";
        int age = 10;

        try {
            if(s == null) throw new AyushException("s cannot be null");

            System.out.println("length: " + s.length());
            System.out.println("age: " + age);
        }
        catch (AyushException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("bye..");
    }
}
