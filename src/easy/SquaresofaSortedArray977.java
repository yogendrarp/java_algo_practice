package easy;

import java.util.Arrays;

public class SquaresofaSortedArray977 {
    public static int[] sortedSquares(int[] nums) {
        int i=0;
        for (int a:nums) {
            nums[i++]=a*a;
        }
        return Arrays.stream(nums).sorted().toArray();
    }

    public static void main(String[] args) {
        int []nums={-4,-1,0,3,10};
        for (int a:sortedSquares(nums)) {
            System.out.print(a+" ");
        }
    }
}
