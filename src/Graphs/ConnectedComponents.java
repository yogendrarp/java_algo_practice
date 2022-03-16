package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ConnectedComponents {
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
        System.out.println(areConnected(adjList));
    }

    private static int areConnected(HashMap<Character, ArrayList<Character>> adjList) {
        int count = 0;
        HashSet<Character> visited = new HashSet<>();
        for (Character c : adjList.keySet()) {
            if (explore(adjList, c, visited)) {
                count++;
            }
        }
        return count;
    }

    private static boolean explore(HashMap<Character, ArrayList<Character>> adjList, Character c, HashSet<Character> visited) {
        if (visited.contains(c)) {
            return false;
        }
        visited.add(c);
        for (char n : adjList.get(c)) {
            explore(adjList, n, visited);
        }
        return true;
    }
}
