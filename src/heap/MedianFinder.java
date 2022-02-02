package heap;

import java.util.PriorityQueue;

// TODO: 2/2/2022
//295. Find Median from Data Stream

class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public MedianFinder() {

    }

    public void addNum(int num) {
        minHeap.add(num);
    }

    public double findMedian() {
        return 1;
    }
}