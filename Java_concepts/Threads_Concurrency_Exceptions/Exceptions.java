package Threads_Concurrency_Exceptions;

// Runtime errors -> Exceptions

// To handle exception we use try-catch block

public class Exceptions {
    public static void main(String[] args) {

        int i = 0;  // 1st statement

        try{
            int j = 18 / i;
            System.out.println(j);
        }
        catch (Exception e) {
            System.out.println("Error ...");
        }

        System.out.println(i);
    }
}
