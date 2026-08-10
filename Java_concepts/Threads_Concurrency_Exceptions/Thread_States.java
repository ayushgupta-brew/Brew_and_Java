package Threads_Concurrency_Exceptions;

/*
 * Thread Lifecycle in Java:
 *
 * A thread moves through different states during its life.
 *
 * 1. NEW:
 *    The thread object is created, but start() has not been called yet.
 *    The thread does not begin execution in this state.
 *
 * 2. RUNNABLE:
 *    After calling start(), the thread enters the runnable state.
 *    In Java, RUNNABLE means the thread is eligible to run.
 *    The JVM and OS decide when it actually gets CPU time.
 *
 * 3. RUNNING:
 *    This is not a separate state in Java's Thread.State enum.
 *    It is part of RUNNABLE.
 *    When the scheduler gives CPU time to the thread, it starts executing run().
 *
 * 4. TIMED_WAITING:
 *    The thread is waiting for a fixed amount of time.
 *    This happens with methods like sleep(), join(timeout), or wait(timeout).
 *
 * 5. WAITING:
 *    The thread waits indefinitely until another thread performs an action.
 *    This can happen with join() or wait() without a timeout.
 *
 * 6. BLOCKED:
 *    The thread is waiting to acquire a monitor lock.
 *    This usually happens when one thread tries to enter a synchronized block
 *    that is already held by another thread.
 *
 * 7. TERMINATED:
 *    The run() method finishes execution or the thread stops due to an error.
 *    After this state, the thread cannot be restarted.
 *
 * Important points:
 * - A thread can move between these states many times.
 * - start() is called only once on a thread object.
 * - Calling run() directly does not start a new thread.
 * - The exact state seen at any moment depends on thread scheduling.
*/

public class Thread_States extends Thread {

    public static void main(String[] args) throws InterruptedException {

        // Create a Thread object
        // At this point, the thread is in NEW state
        Thread_States thread = new Thread_States();

        System.out.println("After creating thread: "
                + thread.getState());

        // start() moves the thread from NEW -> RUNNABLE
        thread.start();

        System.out.println("After calling start(): "
                + thread.getState());

        // Give the thread some time to execute
        Thread.sleep(10);

        // If the thread is sleeping, its state will be TIMED_WAITING.
        // Otherwise, it may be RUNNABLE because the exact state
        // depends on thread scheduling.
        System.out.println("While thread is running: "
                + thread.getState());

        // join() makes the main thread wait until
        // the created thread finishes execution.
        thread.join();

        // After run() completes:
        // RUNNABLE -> TERMINATED
        System.out.println("After thread completes: "
                + thread.getState());
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            System.out.println("Hello World");

            try {
                // sleep() temporarily pauses the thread.
                // Thread state becomes TIMED_WAITING.
                Thread.sleep(10);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}