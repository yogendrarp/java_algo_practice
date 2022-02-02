package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> mp.get(n1) - mp.get(n2));
        for (int n : mp.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            top[i] = heap.poll();
        }
        return top;
    }

    public static void main(String[] args) {
        int[] nums = {7, 7, 7, 8, 8, 9, 5, 6, 4};
        int k = 2;
        topKFrequent(nums, k);
    }
}
