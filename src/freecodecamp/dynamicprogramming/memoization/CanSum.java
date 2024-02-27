package freecodecamp.dynamicprogramming.memoization;

import java.util.HashMap;

/**
 * Write a function `canSum(targetSum, numbers)` that takes in a
 * targetSum and an array of numbers as arguments.
 * The function should return a boolean indicating whether or not it is
 * possible to generate the targetSum using numbers from the array.
 * You may use an element of the array as many times ad needed.
 * You may assume that all input numbers are nonnegative
 */
public class CanSum {

    /**
     *
     * @param targetSum
     * @param nums
     * @return
     */
    static boolean canSum(int targetSum, int[] nums) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        for (Integer num: nums) {
            int remainder = targetSum - num;
            if (canSum(remainder, nums)) {
                return true;
            }
        }
        return false;
    }

    static boolean canSumMemoization(int targetSum, int[] nums, HashMap<Integer, Boolean> memo) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        for (Integer num: nums) {
            int reminder = targetSum - num;
            if (canSumMemoization(reminder, nums, memo)) {
                memo.put(reminder, true);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canSum(5, new int[]{3, 4, 1, 1}));
        System.out.println(canSum(7, new int[]{2, 4}));
        System.out.println(canSum(7, new int[]{5, 3, 4, 7}));
        System.out.println("---Memoization---");
        System.out.println(canSumMemoization(7, new int[] {4, 2}, new HashMap<>()));
        System.out.println(canSumMemoization(7, new int[]{5, 3, 4, 7}, new HashMap<>()));
    }
}
