package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reveres_Queue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);

        reverseQueue(q);
    }
    public static void reverseQueue(Queue<Integer> q){

        // Stack is used because it follows LIFO
        Stack<Integer> st = new Stack<>();

        // Move all queue elements into stack
        while(!q.isEmpty()){
            st.push(q.poll());
        }

        // Add elements back to queue in reversed order
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
