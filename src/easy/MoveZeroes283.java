package easy;

public class MoveZeroes283 {

    public static void moveZeroesExtraSpace(int[] nums) {
        int[] alt = new int[nums.length];
        int j = nums.length - 1, k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                alt[j--] = 0;
            } else {
                alt[k++] = nums[i];
            }
        }
        System.arraycopy(alt, 0, nums, 0, nums.length);
    }

    public static void moveZeroes(int[] nums) {
        int p1 = 0, p2 = 1;
        while (p2 < nums.length) {
            if (nums[p1] == 0 && nums[p2] != 0) {
                nums[p1] = nums[p2];
                nums[p2] = 0;
                p1++;
                p2++;
            } else if (nums[p1] == 0 && nums[p2] == 0) {
                p2++;
            } else {
                p1++;
                p2++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int a : nums) {
            System.out.print(a + " ");
        }
    }
}
