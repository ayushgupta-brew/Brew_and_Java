package Queues;

import java.util.*;

public class Basic_Queue_Operations {
    public static void main(String[] args) {

        // Queue follows FIFO (First In First Out)
        Queue<Integer> q = new LinkedList<>();

        // Add elements to the rear of the queue
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);

        System.out.println(q);

        // Removes the front element from the queue
        q.poll();
        System.out.println(q);

        // Returns the front element without removing it
        System.out.println(q.peek());
        }
}
