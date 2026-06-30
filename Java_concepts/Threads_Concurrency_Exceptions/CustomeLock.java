package Threads_Concurrency_Exceptions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomeLock extends Thread{

    private static final Lock lock = new ReentrantLock();

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

    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 1; i <= 50; i++) {
                System.out.println(Thread.currentThread().getName() + " = " + i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
