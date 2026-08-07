package Threads_Concurrency_Exceptions;

/*
 * ============================================================
 * 1. CREATING THREAD BY EXTENDING Thread CLASS
 * ============================================================
 *
 * We create our own class and extend Thread.
 *
 * Since Thread already provides the start() method,
 * we only need to override run() and write our task inside it.
 */
class Thread_Extends_Thread extends Thread {

    // Constructor to set the thread name
    public Thread_Extends_Thread(String name) {
        super(name);
    }

    /*
     * run()
     *
     * Contains the task that should be executed
     * by this thread.
     */
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Extends Thread -> " + i + " | Thread Name: " + Thread.currentThread().getName());
        }
    }
}


/*
 * ============================================================
 * 2. CREATING THREAD BY IMPLEMENTING Runnable
 * ============================================================
 *
 * Runnable is a functional interface.
 *
 * It contains:
 *
 *     void run();
 *
 * We implement Runnable and provide the task inside run().
 *
 * Runnable itself is NOT a thread.
 * We need to pass the Runnable object to a Thread object.
 */
class Thread_Implements_Runnable implements Runnable {

    /*
     * run()
     *
     * Contains the task that will be executed
     * by the Thread.
     */
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Implements Runnable -> " + i + " | Thread Name: " + Thread.currentThread().getName());
        }
    }
}


/*
 * ============================================================
 * 3. MAIN CLASS
 * ============================================================
 *
 * Here we demonstrate:
 *
 * 1. Extending Thread
 * 2. Implementing Runnable
 * 3. Runnable using Lambda
 * 4. Thread using Lambda directly
 */
public class Threads_Main_Lambda {

    public static void main(String[] args) {


        // ====================================================
        // 1. Thread using extends Thread
        // ====================================================

        Thread_Extends_Thread thread1 = new Thread_Extends_Thread("Extends-Thread");

        /*
         * start()
         *
         * Creates a new thread and then internally
         * calls the run() method.
         *
         * DO NOT directly call run() when you want
         * a new thread.
         */
        thread1.start();

        System.out.println("Thread 1 Name -> " + thread1.getName());

        System.out.println("Thread 1 ID -> " + thread1.threadId());


        // ====================================================
        // 2. Thread using implements Runnable
        // ====================================================

        /*
         * Create an object of our Runnable implementation.
         *
         * This object contains the task.
         */
        Thread_Implements_Runnable runnable = new Thread_Implements_Runnable();

        /*
         * Runnable is not a Thread.
         *
         * Therefore, we pass the Runnable object
         * to the Thread constructor.
         */
        Thread thread2 = new Thread(runnable, "Runnable-Thread");

        thread2.start();

        System.out.println("Thread 2 Name -> " + thread2.getName());

        System.out.println("Thread 2 ID -> " + thread2.threadId());


        // ====================================================
        // 3. Runnable using Lambda
        // ====================================================

        /*
         * Runnable is a functional interface.
         *
         * Therefore, we can replace:
         *
         * new Runnable() {
         *     @Override
         *     public void run() {
         *         ...
         *     }
         * }
         *
         * with a lambda expression.
         */
        Runnable lambdaRunnable = () -> {

            for (int i = 0; i < 5; i++) {

                System.out.println("Lambda Runnable -> " + i + " | Thread Name: " + Thread.currentThread().getName());
            }
        };


        Thread thread3 = new Thread(lambdaRunnable, "Lambda-Runnable-Thread");

        thread3.start();

        System.out.println("Thread 3 Name -> " + thread3.getName());

        System.out.println("Thread 3 ID -> " + thread3.threadId());


        // ====================================================
        // 4. Thread using Lambda directly
        // ====================================================

        /*
         * Since Thread has a constructor that accepts Runnable,
         * we can directly pass a lambda.
         *
         * This is the shortest way to create a thread
         * when the task is small.
         */
        Thread thread4 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {

                System.out.println("Direct Lambda Thread -> " + i + " | Thread Name: " + Thread.currentThread().getName());
            }

        }, "Direct-Lambda-Thread");

        thread4.start();

        System.out.println("Thread 4 Name -> " + thread4.getName());

        System.out.println("Thread 4 ID -> " + thread4.threadId());


        // ====================================================
        // MAIN THREAD
        // ====================================================

        /*
         * The main() method itself runs inside a thread.
         *
         * JVM automatically creates the "main" thread
         * and executes main() inside it.
         */
        Thread currentThread = Thread.currentThread();

        System.out.println("Current Thread Name -> " + currentThread.getName());

        System.out.println("Current Thread ID -> " + currentThread.threadId());
    }
}