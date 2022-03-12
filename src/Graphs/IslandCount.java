package Graphs;

import java.util.HashSet;

public class IslandCount {

    public static void main(String[] args) {
        Character[][] grid = new Character[6][5];
        grid[0] = new Character[]{'W', 'L', 'W', 'W', 'W'};
        grid[1] = new Character[]{'W', 'L', 'W', 'W', 'W'};
        grid[2] = new Character[]{'W', 'W', 'W', 'L', 'W'};
        grid[3] = new Character[]{'W', 'W', 'L', 'L', 'W'};
        grid[4] = new Character[]{'L', 'W', 'W', 'L', 'L'};
        grid[5] = new Character[]{'L', 'L', 'W', 'W', 'W'};

        System.out.println(countIslands(grid));
    }

    private static int countIslands(Character[][] grid) {
        HashSet<String> visited = new HashSet<>();
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (explore(grid, i, j, visited)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    private static boolean explore(Character[][] grid, int i, int j, HashSet<String> visited) {
        if (i < 0 || i >= grid.length) return false;
        if (j < 0 || j >= grid[0].length) return false;
        if (grid[i][j] == 'W') return false;
        String key = i + "," + j;
        if (visited.contains(key)) {
            return false;
        }
        visited.add(key);

        explore(grid, i - 1, j, visited);
        explore(grid, i + 1, j, visited);
        explore(grid, i, j - 1, visited);
        explore(grid, i, j + 1, visited);

        return true;

    }
}
