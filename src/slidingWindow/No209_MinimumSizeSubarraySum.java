package slidingWindow;

/**
 * Main two pointers, shift these pointers
 */
public class No209_MinimumSizeSubarraySum {

    public int solution(int[] nums, int target) {
        int l = 0, total = 0, len = nums.length, res = Integer.MAX_VALUE;
        for (int r = 0; r < len; r++) {
            total += nums[r];
            while (total >= target) {
                res = Math.min(r - l + 1, res);
                total = total - nums[l];
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0: res;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length, curWindown = Integer.MAX_VALUE, sum;
        for (int i = 0; i < len; i++) {
            sum = 0;
            for (int j = i; j < len; j++) {
                sum = sum + nums[j];
                if (sum >= target) {
                    curWindown = Math.min(j - i + 1, curWindown);
                    break;
                }
            }
        }
        return curWindown < Integer.MAX_VALUE ? curWindown: 0;
    }
}
