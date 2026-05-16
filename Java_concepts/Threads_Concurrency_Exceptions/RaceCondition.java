package Threads_Concurrency_Exceptions;

// If we use threads we should work with immutable items as they make thread safe and optimized

// join() helps to join the main threads to the other threads

// The synchronized keyword is used to prevent multiple threads from accessing a block of code or method at the same time, to avoid conflicts or data problems.

class Counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj =() -> {
            for(int i = 0 ; i < 1000 ; i++) {
                c.increment();
            }
            };
        Runnable obj1 =() -> {
            for(int i = 0 ; i < 1000 ; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();  // used to join these two threads to main and main prints the count
        t2.join();

        System.out.println(c.count);
    }
}
