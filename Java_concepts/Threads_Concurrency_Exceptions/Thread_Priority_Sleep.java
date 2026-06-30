package Threads_Concurrency_Exceptions;

// priority of thread range from -> 1 to 10 (1 means least and 10 means highest priority) we can set the priority also

// sleep() method will allow us to make the thread sleep or wait for milliseconds that we want

// when we use sleep we have to put it in a try catch block necessary

class exam extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class exam1 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread_Priority_Sleep {
    public static void main(String[] args) {

        exam obj = new exam();
        exam1 obj1 = new exam1();

        obj.start();
        try{
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj1.start();
    }
}
