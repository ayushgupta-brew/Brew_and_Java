package Stacks;

import java.util.Stack;

public class Balanced_Parentheses {
    static void main() {
        String s = "()[{}()]";

        System.out.println(optimalApproach(s));
    }
    public static boolean optimalApproach(String s){
        Stack<Character> characterStack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                characterStack.push(ch);
            }
            else{
                if(characterStack.isEmpty()){
                    return false;
                }
                char top = characterStack.pop();

                if ((ch == ')' && top == '(') ||
                        (ch == ']' && top == '[') ||
                        (ch == '}' && top == '{'))
                    continue;
                else
                    return false;
            }
        }
        return characterStack.isEmpty();
    }
}