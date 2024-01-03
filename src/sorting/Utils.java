package sorting;

import java.util.Arrays;

public class Utils {
    public static void rightShift(int nums[], int start, int end, int steps) {
        int[] temp = Arrays.copyOf(nums, nums.length);

        for (int i = start; i < end; i++) {
            int newPosition = i + steps;
            nums[newPosition] = temp[i];
        }
    }
}
