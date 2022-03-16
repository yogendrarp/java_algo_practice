package stacks_queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class OpenTheLock752 {


    public static void main(String[] args) {
        String[] deadends=new String[]{"8888"};
        System.out.println(getLevels(deadends,"0009"));
    }

    private static int getLevels(String[] deadend, String target) {
        HashSet<String> deadends=new HashSet(Arrays.asList(deadend));
        HashSet<String> visited=new HashSet();
        Queue<String> combinations=new LinkedList();
        combinations.offer("0000");
        visited.add("0000");

        int level=0;
        while(!combinations.isEmpty()){
            int size=combinations.size();
            while(size>0){
                String lock_position=combinations.poll();
                if(deadends.contains(lock_position)){
                    size--;
                    continue;
                }
                if(lock_position.equals(target)){
                    return level;
                }
                StringBuilder sb=new StringBuilder(lock_position);
                for(int i=0;i<4;i++){
                    char currChar=lock_position.charAt(i);
                    String s1=sb.substring(0,i)+(currChar=='9'?0:currChar-'0'+1)+sb.substring(i+1);
                    String s2=sb.substring(0,i)+(currChar=='0'?9:currChar-'0'-1)+sb.substring(i+1);

                    if(!visited.contains(s1) && !deadends.contains(s1)){
                        combinations.offer(s1);
                        visited.add(s1);
                    }
                    if(!visited.contains(s2) && !deadends.contains(s2)){
                        combinations.offer(s2);
                        visited.add(s2);
                    }

                }
                size--;
            }
            level++;
        }
        return -1;
    }
}
