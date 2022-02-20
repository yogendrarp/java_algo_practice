package arrays;

public class ValidMountainArray941 {

    public static boolean validMountainArray(int[] arr) {
        boolean valley = false, mountain = false;
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] && !valley) {
                mountain=true;
                continue;
            } else if (arr[i] > arr[i + 1] & !valley) {
                valley = true;
            } else if (valley && arr[i] > arr[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        if (valley && mountain) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6};
        System.out.println(validMountainArray(arr));
    }
}
