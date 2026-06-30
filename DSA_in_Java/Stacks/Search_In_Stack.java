package Stacks;

import java.util.Stack;

public class Search_In_Stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // Push elements into the stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int target = 40;

        // Search for the target element
        int ans = searchInStack(st , target);

        // Original stack remains unchanged
        System.out.println(st);
        System.out.println("index" + " -> " + ans + " Element is - " + target);
    }

    public static int searchInStack(Stack<Integer> st , int target){

        // Temporary stack used to restore the original stack
        Stack<Integer> temp = new Stack<>();

        // Distance of the element from the top of the stack
        int indexFromTop = 0;

        // Stores the result (-1 means element not found)
        int count = -1;

        // Traverse the stack from top to bottom
        while(!st.isEmpty()){

            // Target found
            if(st.peek() == target){
                count = indexFromTop;
                break;
            }

            // Restore the original stack
            temp.push(st.pop());
            indexFromTop++;
        }

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return count;
    }
}
