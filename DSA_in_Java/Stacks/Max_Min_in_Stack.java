package Stacks;

import java.util.Stack;

public class Max_Min_in_Stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(30);
        st.push(100);
        st.push(50);
        st.push(50);

        int ans1 = MaxInStack(st);
        int ans2 = MinInStack(st);
        System.out.println(st);

        System.out.println("Maximum element in stack is -> "+ans1);
        System.out.println("Minimum element in stack is -> "+ans2);
    }

    public static int MaxInStack(Stack<Integer> st){

        Stack<Integer> temp = new Stack<>();
        int max = Integer.MIN_VALUE;

        while(!st.isEmpty()) {
        int top = st.pop();
            if (top > max) {
                max = top;
            }
            temp.push(top);
        }

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return max;
    }
    public static int MinInStack(Stack<Integer> st){

        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;

        while(!st.isEmpty()) {
            int top = st.pop();
            if (top < min) {
                min = top;
            }
            temp.push(top);
        }

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return min;
    }
}
