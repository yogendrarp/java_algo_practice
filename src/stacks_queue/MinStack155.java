package stacks_queue;

import java.util.Stack;

public class MinStack155 {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack155() {
        mainStack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if(mainStack.size()==1){
            minStack.push(val);
        }else if(minStack.peek()>=val){
            minStack.push(val);
        }
    }

    public void pop() {
        if(mainStack.size()>=1){
            int value=mainStack.peek();
            mainStack.pop();
            if(value==minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack155 min=new MinStack155();
        min.push(-2);
        min.push(0);
        min.push(-3);
        System.out.println(min.getMin());
        min.pop();
        min.top();
        System.out.println(min.getMin());
    }
}
