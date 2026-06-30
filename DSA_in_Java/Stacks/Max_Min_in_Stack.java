package Stacks;

import java.util.Stack;

public class Max_Min_in_Stack {
    public static void main(String[] args) {

        // Create a stack and add elements
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(30);
        st.push(100);
        st.push(50);
        st.push(50);

        // Find maximum and minimum elements without modifying the stack
        int ans1 = MaxInStack(st);
        int ans2 = MinInStack(st);

        // Original stack remains unchanged
        System.out.println(st);

        System.out.println("Maximum element in stack is -> "+ans1);
        System.out.println("Minimum element in stack is -> "+ans2);
    }

    public static int MaxInStack(Stack<Integer> st){

        // Temporary stack used to restore original stack order
        Stack<Integer> temp = new Stack<>();

        // Initialize max with the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Traverse the stack
        while(!st.isEmpty()) {
        int top = st.pop();

            // Update maximum if a larger element is found
            if (top > max) {
                max = top;
            }
            temp.push(top);
        }

        // Restore all elements back to the original stack
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return max;
    }
    public static int MinInStack(Stack<Integer> st){

        // Temporary stack used to restore original stack order
        Stack<Integer> temp = new Stack<>();

        // Initialize min with the largest possible integer value
        int min = Integer.MAX_VALUE;

        // Traverse the stack
        while(!st.isEmpty()) {
            int top = st.pop();

            // Update minimum if a smaller element is found
            if (top < min) {
                min = top;
            }
            temp.push(top);
        }

        // Restore all elements back to the original stack
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return min;
    }
}
