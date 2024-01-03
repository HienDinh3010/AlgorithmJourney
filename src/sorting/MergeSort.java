package sorting;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] nums) {
        int len = nums.length;
        int l = 0, r = len - 1;
        mergeSort(nums, l, r);
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(nums, l, m);
            mergeSort(nums, m + 1, r);
            merge(nums, l, m, r);
        }
    }

    private void merge(int nums[], int l, int m, int r) {
        int len = r - l + 1;
        int[] arr = new int[len];
        int lIndex = l, rIndex = m + 1;
        for (int i = 0; i < len; i++) {
            if (rIndex > r) {
                arr[i] = nums[lIndex];
                lIndex++;
                continue;
            }
            if (lIndex > m) {
                arr[i] = nums[rIndex];
                rIndex++;
                continue;
            }
            if (nums[lIndex] <= nums[rIndex]) {
                arr[i] = nums[lIndex];
                lIndex++;
            } else {
                arr[i] = nums[rIndex];
                rIndex++;
            }
        }
        for (int i = 0; i < len; i++) {
            nums[i + l] = arr[i];
        }
        Arrays.stream(nums).forEach(i -> System.out.print(" " + i));
        System.out.println("");
     }
}
