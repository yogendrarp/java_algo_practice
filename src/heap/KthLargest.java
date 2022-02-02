package heap;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    int resSize;

    public KthLargest(int k, int[] nums) {
        resSize = k;
        for (int num : nums) {
            addAndHeapify(num);
        }
    }

    private void addAndHeapify(int num) {
        if (minHeap.size() < resSize) {
            minHeap.add(num);
            return;
        }
        if (minHeap.size() > 0 && minHeap.peek() < num) {
            minHeap.poll();
            minHeap.add(num);
        }
    }

    public int add(int val) {
        addAndHeapify(val);
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
