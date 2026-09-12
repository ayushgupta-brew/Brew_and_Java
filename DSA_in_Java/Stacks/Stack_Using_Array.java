package Stacks;

import java.util.Arrays;
import java.util.List;

class Stack_Using_Array {

    private final int[] arrayStack;
    private final int capacity;
    private int topIndex;

    public Stack_Using_Array(int size) {
        capacity = size;
        arrayStack = new int[capacity];
        topIndex = -1;
    }

    public Stack_Using_Array() {
        this(1024);
    }

    public void push(int x) {
        if (topIndex >= capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arrayStack[++topIndex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arrayStack[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arrayStack[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public static void main(String[] args) {

        Stack_Using_Array stack = new Stack_Using_Array();

        List<String> commands = Arrays.asList(
                "ArrayStack",
                "push",
                "push",
                "top",
                "pop",
                "isEmpty"
        );

        List<List<Integer>> inputs = Arrays.asList(
                List.of(),
                List.of(10),
                List.of(20),
                List.of(),
                List.of(),
                List.of()
        );

        for (int i = 0; i < commands.size(); i++) {

            switch (commands.get(i)) {

                case "ArrayStack":
                    System.out.print("null ");
                    break;

                case "push":
                    stack.push(inputs.get(i).getFirst());
                    System.out.print("null ");
                    break;

                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;

                case "top":
                    System.out.print(stack.top() + " ");
                    break;

                case "isEmpty":
                    System.out.print(stack.isEmpty() + " ");
                    break;
            }
        }
    }
}