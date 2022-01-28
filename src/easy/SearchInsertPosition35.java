package easy;

public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(low>high){
            return low;
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target=5;
        System.out.println(searchInsert(nums,target));
    }
}
