package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementinaSortedMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxHeap.size() < k) {
                    maxHeap.add(matrix[i][j]);
                } else if (matrix[i][j] < maxHeap.peek()) {
                    maxHeap.poll();
                    maxHeap.add(matrix[i][j]);
                }
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}
