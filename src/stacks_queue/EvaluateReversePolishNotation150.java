package stacks_queue;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("*") || token.equals("/") || token.equals("-")) {
                int b = stack.peek();
                stack.pop();
                int a = stack.peek();
                stack.pop();
                int result = Integer.MIN_VALUE;
                switch (token) {
                    case "+":
                        result = a + b;
                    case "-":
                        result=a-b;
                    case "*":
                        result=a*b;
                    case "/":
                        result=a/b;
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation150 ev=new EvaluateReversePolishNotation150();
        int result=ev.evalRPN(new String[]{"2","1","+","3","*"});
        System.out.println(result);
    }
}
