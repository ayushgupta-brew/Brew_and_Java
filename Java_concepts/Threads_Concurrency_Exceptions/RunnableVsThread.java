package Threads_Concurrency_Exceptions;

// Thread class implements Runnable class so we can directly implement Runnable class to our class

// When we implement Runnable class we  have to make two threads object to start the threads

public class RunnableVsThread {
    public static void main(String[] args) {

        Runnable obj1 =() -> {   // reference of the implemented class
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Hii");
                }
        };
        Runnable obj2 = () -> {                // lambda expression
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Hello");
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
