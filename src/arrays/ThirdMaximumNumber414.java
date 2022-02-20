package arrays;

import java.util.*;

public class ThirdMaximumNumber414 {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int pos = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            // If two consecutive numbers are same, then ignore
            if (nums[i + 1] == nums[i]) {
                continue;
            }
            // If pos is 2 and it has come to this line means this is the 3rd heights number
            if (pos == 2) {
                return nums[i];
            }
            pos++;
        }
        // If the third maximum does not exist, return the maximum number
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(thirdMax(arr));
    }
}
