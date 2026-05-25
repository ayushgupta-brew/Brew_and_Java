package Stacks;

import java.util.Stack;

public class Basic_Stack_Operations {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        for(int i = 1 ; i<=10 ; i++){
            st.push(i);
        }

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st + " " + st.size());

        System.out.println(st.peek());

        int pop = st.pop();
        System.out.println(pop + " " + st.size());

        System.out.println(st.isEmpty());
    }
}