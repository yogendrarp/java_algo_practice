package arrays;

import java.util.Arrays;

public class RemoveElement27 {

    public static int removeElement(int[] nums, int val) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[index++]=nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int ret = removeElement(nums, val);
        System.out.println(ret);
        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
    }
}
