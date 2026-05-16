package Threads_Concurrency_Exceptions;

class Counter1{
    private int count= 0;
//    public synchronized void setCount()  // syncronized in method
    public void setCount(){  // syncronized in particular block
        synchronized (this) {
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}

public class SyncroniseCounter {
    public static void main(String[] args) {

//        Counter1 counter1 = new Counter1();
//        MyThread t1 = new MyThread(counter1);
//        MyThread t2 = new MyThread(counter1);
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.print(counter1.getCount()+" ");
    }
}
