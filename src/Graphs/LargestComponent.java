package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LargestComponent {

    public static void main(String[] args) {
        char[][] adjMatrix = new char[5][2];
        adjMatrix[0] = new char[]{'i', 'j'};
        adjMatrix[1] = new char[]{'k', 'i'};
        adjMatrix[2] = new char[]{'m', 'k'};
        adjMatrix[3] = new char[]{'k', 'l'};
        adjMatrix[4] = new char[]{'o', 'n'};
        HashMap<Character, ArrayList<Character>> graph = new HashMap<>();
        for (char[] mat : adjMatrix) {
            if (!graph.containsKey(mat[0])) {
                graph.put(mat[0], new ArrayList<>());
            }
            graph.get(mat[0]).add(mat[1]);

            if (!graph.containsKey(mat[1])) {
                graph.put(mat[1], new ArrayList<>());
            }
            graph.get(mat[1]).add(mat[0]);
        }

        System.out.println(largestComponent(graph));

    }

    private static long largestComponent(HashMap<Character, ArrayList<Character>> graph) {
        HashSet<Character> visited = new HashSet<>();
        long maxCount = 0;
        for (Character node : graph.keySet()) {
            long count = getCount(node, graph, visited);
            if (maxCount < count) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    private static long getCount(Character node, HashMap<Character, ArrayList<Character>> graph, HashSet<Character> visited) {
        if (visited.contains(node)) {
            return 0;
        }
        visited.add(node);
        long curr = 1;
        for (Character c : graph.get(node)) {
            curr += getCount(c, graph, visited);
        }

        return curr;
    }
}
