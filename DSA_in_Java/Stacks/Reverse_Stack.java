package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse_Stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        reverseStackUingArrayList(st);
        reverseStackUingStack(st);
    }

    public static void reverseStackUingArrayList(Stack<Integer> st){

        ArrayList<Integer> list= new ArrayList<>();

        while(!st.isEmpty()){
            list.add(st.pop());
        }

        for(int i : list){
            st.push(i);
        }

        System.out.println(st);
    }

    public static void reverseStackUingStack(Stack<Integer> st){

        Stack<Integer> temp = new Stack<>();

        while(!st.isEmpty()){
//            int top = st.pop();
//            System.out.print(top + " ");
//            temp.push(top);

            temp.push(st.pop());
        }
        System.out.print(temp);
    }
}
