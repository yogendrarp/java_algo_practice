package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UndirectedGraph {


    public static void main(String[] args) {
        char[][] adjMatrix = new char[5][2];
        adjMatrix[0] = new char[]{'i', 'j'};
        adjMatrix[1] = new char[]{'k', 'i'};
        adjMatrix[2] = new char[]{'m', 'k'};
        adjMatrix[3] = new char[]{'k', 'l'};
        adjMatrix[4] = new char[]{'o', 'n'};

        HashMap<Character, ArrayList<Character>> adjList = new HashMap<>();
        HashSet<Character> visited = new HashSet<>();
        for (char[] m : adjMatrix) {
            if (!adjList.containsKey(m[0])) {
                adjList.put(m[0], new ArrayList<>());
            }
            adjList.get(m[0]).add(m[1]);
            if (!adjList.containsKey(m[1])) {
                adjList.put(m[1], new ArrayList<>());
            }
            adjList.get(m[1]).add(m[0]);
        }
        System.out.println(hasPath(adjList, 'i', 'o', visited));
    }

    private static boolean hasPath(HashMap<Character, ArrayList<Character>> adjList, char src, char dest, HashSet<Character> set) {
        if (src == dest) {
            return true;
        }
        if (set.contains(src)) return false;
        set.add(src);

        for (char neigh : adjList.get(src)) {
            if (hasPath(adjList, neigh, dest, set)) {
                return true;
            }
        }
        return false;
    }
}
