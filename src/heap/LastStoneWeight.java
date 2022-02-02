package heap;

import javax.swing.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer stone : stones) {
            maxHeap.add(stone);
        }
        while (maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if (x == y) {
                continue;
            } else {
                int rem = x - y;
                maxHeap.add(rem);
            }
        }
        return maxHeap.size() > 0 ? maxHeap.peek() : 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(nums));
    }
}
