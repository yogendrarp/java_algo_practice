package arrays;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n, j = 0;
        while (i < (m + n)) {
            nums1[i++] = nums2[j++];
        }
        nums1 = Arrays.stream(nums1).sorted().toArray();
        Arrays.stream(nums1).forEach(x -> System.out.println(x+" "));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
}
