package Threads_Concurrency_Exceptions;

public class Practice_Threads {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        try {
        t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

