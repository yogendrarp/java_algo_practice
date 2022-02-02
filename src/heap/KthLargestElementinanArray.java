package heap;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i = 1;
        for (int num : nums) {
            if (i <= k) {
                minHeap.add(num);
                i++;
                continue;
            }
            if (minHeap.peek() < num) {
                minHeap.poll();
                minHeap.add(num);
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.print(findKthLargest(nums, k));
    }
}
