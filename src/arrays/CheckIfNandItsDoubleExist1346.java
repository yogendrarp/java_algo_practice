package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CheckIfNandItsDoubleExist1346 {

    public static boolean checkIfExist(int[] arr) {
        HashSet<Double> set = new HashSet<>();
        for (int a : arr) {
            double mul = a * 2;
            double div = (double) a / 2;
            if (set.contains(mul) || set.contains(div)) {
                return true;
            }
            set.add((double) a);
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));
    }
}
