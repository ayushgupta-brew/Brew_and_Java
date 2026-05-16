package Stacks;

import java.util.Stack;

public class Search_In_Stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int target = 40;
        int ans = searchInStack(st , target);

        System.out.println(st);
        System.out.println("index" + " -> " + ans + " Element is - " + target);
    }

    public static int searchInStack(Stack<Integer> st , int target){

        Stack<Integer> temp = new Stack<>();
        int indexFromTop = 0;
        int count = -1;

        while(!st.isEmpty()){
            if(st.peek() == target){
                count = indexFromTop;
                break;
            }
            temp.push(st.pop());
            indexFromTop++;
        }

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return count;
    }
}
