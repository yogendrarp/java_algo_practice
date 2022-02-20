package arrays;

public class RemoveDuplicatesFromSortedArray26 {

    public static int removeDuplicates(int[] nums) {
        int index=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[++index]=nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }
}
