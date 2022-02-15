package arrays;

import java.util.Arrays;

public class SquaresofaSortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        for (int a:nums) {
            nums[i++]=a*a;
        }
        return Arrays.stream(nums).sorted().toArray();
    }
    public static void main(String[] args) {

    }
}
