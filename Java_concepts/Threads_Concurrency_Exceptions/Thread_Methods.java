package Threads_Concurrency_Exceptions;

/*
 * Thread methods demonstrated in this example:
 *
 * 1. start()
 *    Starts a new thread and internally calls run().
 *
 * 2. run()
 *    Contains the work executed by the thread.
 *
 * 3. currentThread()
 *    Returns the thread that is currently executing.
 *
 * 4. getName() / setName()
 *    Reads or changes the thread name.
 *
 * 5. getId()
 *    Returns the unique thread id.
 *
 * 6. getPriority() / setPriority()
 *    Reads or changes thread priority.
 *
 * 7. getState()
 *    Returns the current lifecycle state of the thread.
 *
 * 8. isAlive()
 *    Returns true if the thread has started and not finished yet.
 *
 * 9. sleep()
 *    Pauses the current thread for some time.
 *
 * 10. interrupt()
 *     Sends an interrupt request to a thread.
 *
 * 11. isInterrupted()
 *     Checks whether the thread has been interrupted.
 *
 * 12. yield()
 *     Gives a hint to the scheduler to run another thread.
 *
 * 13. join()
 *     Makes the current thread wait until another thread completes.
 *
 * 14. setDaemon(true)
 *     Marks a thread as a daemon thread.
 *     A daemon thread runs in the background.
 *     JVM exits when only daemon threads are left.
 *
 */

public class Thread_Methods extends Thread {

    public Thread_Methods(String name) {
        // setName() via constructor-style setup
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {

        // currentThread() returns the currently running thread
        System.out.println("Main thread: " + Thread.currentThread().getName());

        Thread_Methods t1 = new Thread_Methods("My-Thread");

        // getName(), threadId(), getPriority(), getState(), isAlive()
        System.out.println("Before start:");
        System.out.println("Name: " + t1.getName());
        System.out.println("ID: " + t1.threadId());
        System.out.println("Priority: " + t1.getPriority());
        System.out.println("State: " + t1.getState());
        System.out.println("Alive: " + t1.isAlive());

        // setPriority() changes thread priority
        t1.setPriority(Thread.NORM_PRIORITY + 1); // Default is = 5
//        t1.setPriority(Thread.MIN_PRIORITY);       Default is = 1
//        t1.setPriority(Thread.MAX_PRIORITY);       Default is = 10

        // setDaemon(true) must be called before start()
        Thread background = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running: " + Thread.currentThread().getName());

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }, "Daemon-Thread");

        background.setDaemon(true);
        background.start();

        // start() starts a new thread
        t1.start();

        System.out.println("After start:");
        System.out.println("State: " + t1.getState());
        System.out.println("Alive: " + t1.isAlive());

        // join() makes main wait until t1 finishes
        t1.join();

        System.out.println("After join:");
        System.out.println("State: " + t1.getState());
        System.out.println("Alive: " + t1.isAlive());

        System.out.println("Main thread finished.");
    }

    @Override
    public void run() {
        // run() is the code executed by the thread
        System.out.println("Inside run(): " + Thread.currentThread().getName());
        System.out.println("currentThread(): " + Thread.currentThread().getName());

        for (int i = 1; i <= 5; i++) {
            System.out.println("Step " + i + " in " + Thread.currentThread().getName());

            // yield() gives a hint to the scheduler to give time to every thread to run
            Thread.yield();

            try {
                // sleep() pauses the current thread
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while sleeping.");
                System.out.println("isInterrupted() before reset: "
                        + Thread.currentThread().isInterrupted());

                // restore interrupt flag
                Thread.currentThread().interrupt();

                System.out.println("isInterrupted() after reset: "
                        + Thread.currentThread().isInterrupted());

                break;
            }
        }

        System.out.println("run() completed for " + Thread.currentThread().getName());
    }
}
