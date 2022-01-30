package medium;

public class RotateArray189 {

    public static void rotate(int[] nums, int k) {
        int actualRotations = k % nums.length;
        int arr[] = new int[nums.length];
        int j = 0;
        for (int i = actualRotations; i < nums.length; i++, j++) {
            arr[j] = nums[i];
        }
        for (int i = 0; i < actualRotations; i++, j++) {
            arr[j] = nums[i];
        }
        System.arraycopy(arr,0,nums,0,nums.length);
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10, 5, 6, 8};
        rotate(nums, 3);
        for (int a : nums) {
            System.out.println(a);
        }
    }
}
