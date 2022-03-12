package Graphs;

import java.util.*;

public class ShortestPath {


    public static void main(String[] args) {
        char[][] adjMatrix = new char[5][2];
        adjMatrix[0] = new char[]{'w', 'x'};
        adjMatrix[1] = new char[]{'x', 'y'};
        adjMatrix[2] = new char[]{'z', 'y'};
        adjMatrix[3] = new char[]{'z', 'v'};
        adjMatrix[4] = new char[]{'w', 'v'};
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

        System.out.println(shortestPath(graph, 'w', 'z'));
    }

    private static Integer shortestPath(HashMap<Character, ArrayList<Character>> graph, char src, char dest) {
        HashSet<Character> visited = new HashSet<>();
        visited.add(src);
        Queue<AbstractMap.SimpleEntry<Character, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(src, 0));
        while (!queue.isEmpty()) {
            AbstractMap.SimpleEntry<Character, Integer> current = queue.poll();
            Character key = (Character) current.getKey();
            Integer value = (Integer) current.getValue();
            if (key.equals(dest)) {
                return value;
            }
            for (Character neig : graph.get(key)) {
                if (!visited.contains(neig)) {
                    visited.add(neig);
                    queue.add(new AbstractMap.SimpleEntry<>(neig, value + 1));
                }
            }
        }
        return -1;
    }
}
