package Threads_Concurrency_Exceptions;

// Shared resource
class Counter {

    private int count; // Shared Object

    // This method is NOT synchronized.
    // Multiple threads can execute count++ at the same time.
/*
    public void incrementCount() {
            count++;
        }
*/

    // synchronized keyword allows only ONE thread at a time to execute this method for the same Counter object.
    public synchronized void incrementCount(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Thread class
public class Synchronization_in_Thread extends Thread {

    // Both threads will use the same Counter object.
    private final Counter counter;

    Synchronization_in_Thread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        // Each thread increments count 10,000 times.
        for (int i = 0; i < 100000; i++) {
            counter.incrementCount();
        }
    }

    public static void main(String[] args) {

        // One shared Counter object.
        Counter counter = new Counter();

        // Both threads receive the SAME Counter object.
        Synchronization_in_Thread t1 = new Synchronization_in_Thread(counter);

        Synchronization_in_Thread t2 = new Synchronization_in_Thread(counter);

        // Start both threads.
        t1.start();
        t2.start();

        try {
            // Main thread waits until t1 finishes.
            t1.join();

            // Main thread waits until t2 finishes.
            t2.join();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Expected = 20,000
        // Actual may be less than 20,000 because of race condition.
        System.out.println("Final count: " + counter.getCount());
    }
}