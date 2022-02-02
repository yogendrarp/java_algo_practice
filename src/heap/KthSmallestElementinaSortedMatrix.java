package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementinaSortedMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxHeap.size() >= k) {
                    if (maxHeap.peek() < matrix[i][j]) {
                        maxHeap.poll();
                    }
                }
                maxHeap.add(matrix[i][j]);
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        kthSmallest(matrix, k);
    }
}
