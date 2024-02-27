package freecodecamp.dynamicprogramming.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class HowSum {

    public static int[] howSum(int targetSum, int[] nums) {
        if (targetSum == 0) return new int[]{};
        if (targetSum < 0) return null;
        for (Integer num: nums) {
            int remainder = targetSum - num;
            int[] remainderResult = howSum(remainder, nums);
            if (remainderResult != null) {
                return IntStream.concat(Arrays.stream(remainderResult), IntStream.of(num)).toArray();
            }
        }
        return null;
    }

    public static List<Integer> howSumMemoization(int targetSum, int[] nums,
                                                  HashMap<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;
        for (Integer num: nums) {
            int reminder = targetSum - num;
            List<Integer> reminderResult = howSumMemoization(reminder, nums, memo);
            if (reminderResult != null) {
                reminderResult.add(num);
                memo.put(reminder, reminderResult);
            }
        }
        memo.put(targetSum, null);
        return null;
    }

    public static void main(String[] args) {
        int[] arr = howSum(7, new int[]{5, 3, 4, 7});//[4, 3]
        Arrays.stream(arr).forEach(num -> System.out.println(num + " "));
        System.out.println("----");
        int[] arr2 = howSum(7, new int[]{2, 3});
        Arrays.stream(arr2).forEach(num -> System.out.println(num + " "));

        System.out.println("---Memoization----");
        List<Integer> list = howSumMemoization(7, new int[]{5, 3, 4, 7}, new HashMap<>());//[4, 3]
        list.forEach(num -> System.out.println(num + " "));
        System.out.println("----");
        List<Integer> list2 = howSumMemoization(7, new int[]{2, 3}, new HashMap<>());
        list2.forEach(num -> System.out.println(num + " "));
    }
}
