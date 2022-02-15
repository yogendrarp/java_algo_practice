package arrays;

public class MaxConsecutiveOnes485 {
    private static int[] arr;

    public static int findMaxConsecutiveOnes(int[] nums) {
        int currMax = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currMax++;
            } else {
                if (currMax > max)
                    max = currMax;
                currMax = 0;
            }
        }
        if (currMax > max) {
            max = currMax;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
