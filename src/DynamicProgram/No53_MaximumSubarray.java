package DynamicProgram;

public class No53_MaximumSubarray {
    public int maxSubArrayBruteforce(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public int maxSubArrayLinearSolution(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int curSum = 0;
            for (int j = i; j < len; j++) {
                curSum = curSum + nums[j];
                if (max < curSum) {
                    max = curSum;
                }
            }
        }
        return max;
    }

    public int maxSubArrayKadaneAlgorithm(int[] nums) {
        int maxSub = nums[0], len = nums.length;
        int curSum = 0;

        for (int i = 0; i < len; i++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += nums[i];
            maxSub = Math.max(maxSub, curSum);
        }
        return maxSub;
    }
}
