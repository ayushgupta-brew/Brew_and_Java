package Stacks;

import java.util.*;
public class Stack_Traversal {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int size = 5;
        for(int i = 0 ; i<size ; i++){
        int insert = sc.nextInt();
            st.push(insert);
        }
        traverse(st);
    }

    public static void traverse(Stack<Integer> st){

        for(int i : st){
            System.out.print(i + " ");
        }

//        Iterator<Integer> iterator = st.iterator();
//
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+ " ");
//        }

//        for(int i = 0 ; i<st.size() ; i++){
//            System.out.print(st.get(i) + " ");
//        }
    }
}