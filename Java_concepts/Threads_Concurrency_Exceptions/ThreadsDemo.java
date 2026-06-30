package Threads_Concurrency_Exceptions;

// if we want to implement thread we extend Thread class

// obj1 and obj2 after extend Thread class they become thread and to call thread we use start() and we need run() to start the thread .

// obj1.start() will call the run method of ex1 .

class ex1 extends Thread {
    public void run(){

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi..");
        }
    }
}

class ex2 extends Thread{
    public void run(){

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello..");
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {

        ex1 obj1 = new ex1();
        ex2 obj2 = new ex2();

        obj1.start();
        obj2.start();
    }
}
