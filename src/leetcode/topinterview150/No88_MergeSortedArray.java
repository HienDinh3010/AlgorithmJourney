package leetcode.topinterview150;

import java.util.Arrays;

public class No88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length, len2 = nums2.length;
        int len = Math.max(len1, len2);
        for (int i = m; i < len; i++) {
            nums1[i] = nums2[i - n];
        }
        Arrays.sort(nums1);
    }
}
