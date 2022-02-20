package arrays;

import java.util.Arrays;

public class HeightChecker1051 {
    public int heightChecker(int[] heights) {
        int[] sortedarr = Arrays.stream(heights).sorted().toArray();
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sortedarr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
