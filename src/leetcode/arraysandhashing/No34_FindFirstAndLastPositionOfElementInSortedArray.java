package leetcode.arraysandhashing;

public class No34_FindFirstAndLastPositionOfElementInSortedArray {

    /**
     * 5,7,7,8,8,10 => 3,4
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length, l = 0, r = len - 1;
        int index = binarySearch(nums, target, l, r);
        if ( index != -1 )  {
            int first = index, last = index;
            while (first > 0 && nums[first - 1] == target) {
                first--;
            }
            while (last < len && nums[last + 1] == target) {
                last++;
            }
            return new int[] {first, last};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, int l, int r) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}
