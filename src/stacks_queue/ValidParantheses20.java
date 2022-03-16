package stacks_queue;

import java.util.Stack;

public class ValidParantheses20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] characters = s.toCharArray();
        for (Character c : characters) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if ((stack.size()>0) && ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '['))) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidParantheses20 validParantheses20 = new ValidParantheses20();
        validParantheses20.isValid("]");
    }
}
