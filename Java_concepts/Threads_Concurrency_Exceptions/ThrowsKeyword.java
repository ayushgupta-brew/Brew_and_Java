package Threads_Concurrency_Exceptions;

// throws keyword helps to duck the exception

// The throws keyword in Java means the method can cause an error, and it's telling whoever calls the method to be ready to handle that error.

class ExceptionExample {
    public void show() throws ClassNotFoundException{

//        Class.forName("Threads_Concurrency_Exceptions.ExceptionExample");
        Class.forName("ThrowsKeyword");
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {

        ExceptionExample exceptionExample = new ExceptionExample();
        try {
            exceptionExample.show();
            System.out.println("Correct Class name");
        }
        catch (ClassNotFoundException e){
            System.out.println("Incorrect class name " + e);
        }
        System.out.println("Bye...");
    }
}
