package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> minHeap = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            minHeap.add(new Point(points[i][0], points[i][1]));
        }
        int[][] closestPoints = new int[k][2];
        for (int i = 0; i < k; i++) {
            closestPoints[i][0] = minHeap.peek().x;
            closestPoints[i][1] = minHeap.peek().y;
            minHeap.poll();
        }
        return closestPoints;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        var result = kClosest(matrix, k);
        System.out.print("Close");
    }
}

class Point implements Comparable<Point> {
    double distance;
    int x;
    int y;

    Point(int x1, int y1) {
        x = x1;
        y = y1;
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


    @Override
    public int compareTo(Point other) {
        if (this.distance > other.distance) {
            return 1;
        } else if (this.distance < other.distance) {
            return -1;
        }
        return 0;
    }
}
