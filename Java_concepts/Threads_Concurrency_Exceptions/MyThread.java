package Threads_Concurrency_Exceptions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    private static final Lock lock = new ReentrantLock();

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
