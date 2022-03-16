package stacks_queue;

import java.util.Stack;

public class DailyTemperatures739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int []result=new int[temperatures.length];
        Stack<Integer> ngr=new Stack<>();
        int k=temperatures.length-1;
        for(int i=temperatures.length-1;i>=0;i--){
            if(ngr.isEmpty()){
                ngr.push(i);
                result[k--]=0;
            }else if(temperatures[ngr.peek()]<=temperatures[i]){
                while(!ngr.isEmpty() && temperatures[ngr.peek()]<=temperatures[i]){
                    ngr.pop();
                }
                if(ngr.isEmpty()){
                    result[k--]=0;
                }else{
                    result[k--]=ngr.peek()-i;
                }
                ngr.push(i);
            }else if(temperatures[ngr.peek()]>temperatures[i]){
                result[k--]=ngr.peek()-i;
                ngr.push(i);
            }
        }
        return result;
    }
}
