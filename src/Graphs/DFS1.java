package Graphs;

import java.util.HashMap;
import java.util.Stack;


public class DFS1 {
    public static void main(String[] args) {
        HashMap<Character, Character[]> graph = new HashMap<>();
        graph.put('a', new Character[]{'c', 'b'});
        graph.put('b', new Character[]{'d'});
        graph.put('c', new Character[]{'e'});
        graph.put('d', new Character[]{'f'});
        graph.put('e', new Character[]{});
        graph.put('f', new Character[]{});
        depthFirstPrint(graph, 'a');
        System.out.println();
        dfSRecursive(graph,'a');
    }

    private static void depthFirstPrint(HashMap<Character, Character[]> graph, char s) {
        Stack<Character> source = new Stack<>();
        source.add(s);
        while (source.size() > 0) {
            char curr = source.pop();
            System.out.print(curr);
            for (Character neigh : graph.get(curr)) {
                source.add(neigh);
            }
        }
    }


    private static void dfSRecursive(HashMap<Character, Character[]> graph, char s) {
        System.out.print(s);
        for (Character c : graph.get(s)) {
            dfSRecursive(graph,c);
        }
    }
}
