package Graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BFS1 {

    public static void main(String[] args) {
        HashMap<Character, Character[]> graph = new HashMap<>();
        graph.put('a', new Character[]{'c', 'b'});
        graph.put('b', new Character[]{'d'});
        graph.put('c', new Character[]{'e'});
        graph.put('d', new Character[]{'f'});
        graph.put('e', new Character[]{});
        graph.put('f', new Character[]{});
        bfsPrint(graph,'a');
    }

    private static void bfsPrint(HashMap<Character, Character[]> graph, char a) {
        Queue<Character> queue=new LinkedList<>();
        queue.add(a);
        while (queue.size()>0){
            Character curr=queue.poll();
            System.out.print(curr+ " ");
            for (Character n:graph.get(curr)) {
                queue.add(n);
            }
        }

    }

}
