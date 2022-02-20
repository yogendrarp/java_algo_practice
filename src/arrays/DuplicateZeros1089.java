package arrays;

import java.util.Arrays;

public class DuplicateZeros1089 {
    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        duplicateZeros(arr);
        System.out.println();
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}
