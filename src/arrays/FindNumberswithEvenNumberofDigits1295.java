package arrays;

public class FindNumberswithEvenNumberofDigits1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int local = 0;
            while (nums[i] > 10 && nums[i] != 0) {
                nums[i] /= 10;
                local++;
            }
            local++;
            if (local % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {100000};
        System.out.println(findNumbers(nums));
    }
}
