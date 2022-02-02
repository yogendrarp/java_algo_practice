package heap;

import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        /*PriorityQueue<Row> minHeap = new PriorityQueue<>();
        int i = -1;
        for (int[] arr : mat) {
            i++;
            int count = 0;
            for (int num : arr) {
                if (num == 1)
                    count++;
            }
            minHeap.offer(new Row(i, count));
        }
        int[] top = new int[k];
        for (int j = 0; j >= k; j++) {
            top[j] = minHeap.poll().index;
        }
        return top;*/
        PriorityQueue<Row> queue= new PriorityQueue();

        for(int i=0;i<mat.length;i++)
        {
            int soldiers=0;
            for(int j=0;j<mat[i].length;j++)
            {
                soldiers+=mat[i][j];
            }
            queue.offer(new Row(i,soldiers));
        }

        int []result = new int[k];
        for(int i=0;i<k;i++)
            result[i]=queue.poll().index;

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        System.out.println(kWeakestRows(mat, 3));
    }
}

/*
class Row implements Comparable<Row> {
    int index;
    int count;

    Row(int in, int c) {
        index = in;
        count = c;
    }

    @Override
    public int compareTo(Row other) {
        if (this.count > other.count) return 1;
        else if (this.count < other.count) return -1;
        else if ((this.index + this.count) > (other.index + other.count)) return 1;
        else if ((this.index + this.count) < (other.index + other.count)) return -1;
        return 0;
    }
}
*/
class Row implements Comparable<Row> {
    int index;
    int soldiers;

    Row(int index, int soldiers) {
        this.index = index;
        this.soldiers = soldiers;
    }

    @Override
    public int compareTo(Row other) {
        int res=0;
        res = this.soldiers-other.soldiers;
        if(res==0)
            res = other.index-this.index;
        return res;
    }

}