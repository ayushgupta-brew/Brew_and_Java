package Queues;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Traverse_Queue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);

        traverse(q);

    }
    public static void traverse(Queue<Integer> q){

        int n = q.size();

        for(int i = 0 ; i<n ; i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }

        // making queue empty
//        while(!q.isEmpty()){
//            int element = q.peek();
//            System.out.print(element + " ");
//            q.poll();
//        }

        // using Iterator->
//        Iterator<Integer> it = q.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next() + " ");
//        }

        // using for-each loop
//        for(int i : q){
//            System.out.print(i + " ");
//        }
    }
}
