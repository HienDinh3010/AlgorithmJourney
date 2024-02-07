package leetcode.topinterview150;

public class No189_RotateArray {

    public int[] solution(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        helper(nums, 0, len - 1);
        helper(nums, 0, k - 1);
        helper(nums, k, len - 1);
        return nums;
    }

    public void helper(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
