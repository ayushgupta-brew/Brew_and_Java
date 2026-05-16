package Threads_Concurrency_Exceptions;

public class Thread_States extends Thread{
    @Override
    public void run() {
        System.out.println("State inside run(): " + Thread.currentThread().getState());

        try {
            Thread.sleep(1000);   // TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread_States pt = new Thread_States();

        // NEW
        System.out.println("After creation: " + pt.getState());

        pt.start();

        // RUNNABLE
        System.out.println("After start(): " + pt.getState());

        Thread.sleep(200); // allow pt to sleep

        // TIMED_WAITING
        System.out.println("While sleeping: " + pt.getState());

        pt.join(); // WAITING for pt to finish

        // TERMINATED
        System.out.println("After completion: " + pt.getState());
    }
}
