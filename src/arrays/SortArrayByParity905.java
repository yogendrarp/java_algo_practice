package arrays;

public class SortArrayByParity905 {
    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int evenPointer = nums.length - 1, oddPointer = 0;
        while (oddPointer < evenPointer) {
            while (nums[oddPointer] % 2 == 0 && oddPointer < evenPointer) {
                oddPointer++;
            }
            while (nums[evenPointer] % 2 == 1 && oddPointer < evenPointer) {
                evenPointer--;
            }
            int temp = nums[oddPointer];
            nums[oddPointer] = nums[evenPointer];
            nums[evenPointer] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        sortArrayByParity(arr);
    }
}
