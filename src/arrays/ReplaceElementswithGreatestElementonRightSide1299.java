package arrays;

public class ReplaceElementswithGreatestElementonRightSide1299 {

    public static int[] replaceElements(int[] arr) {
        int currMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > currMax) {
                int temp = arr[i];
                arr[i] = currMax;
                currMax = temp;
            } else {
                arr[i] = currMax;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        replaceElements(arr);
    }
}
