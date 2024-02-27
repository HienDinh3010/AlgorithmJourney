package freecodecamp.dynamicprogramming.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BestSum {
    static List<Integer> bestSum(int targetSum, List<Integer> numbers) {
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;
        List<Integer> shortestCombination = null;
        for (Integer num: numbers) {
            int reminder = targetSum - num;
            List<Integer> reminderCombination = bestSum(reminder, numbers);
            if (reminderCombination != null) {
                List<Integer> combination = Stream.concat(reminderCombination.stream(), Stream.of(num))
                        .collect(Collectors.toList());
                //If the combination is shorter than the current "shortest", update it
                if (shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        return shortestCombination;
    }

    static List<Integer> bestSumMemo(int targetSum, List<Integer> numbers, HashMap<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;
        List<Integer> shortestCombination = null;
        for (Integer num: numbers) {
            int reminder = targetSum - num;
            List<Integer> reminderCombination = bestSumMemo(reminder, numbers, memo);
            if (reminderCombination != null) {
                List<Integer> combination = Stream.concat(reminderCombination.stream(), Stream.of(num))
                        .collect(Collectors.toList());
                //If the combination is shorter than the current "shortest", update it
                if (shortestCombination == null || combination.size() < shortestCombination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }

    public static void main(String[] args) {
        List<Integer> list = bestSum(7, Arrays.asList(5, 3, 4, 7));
        list.forEach(num -> System.out.println(num));
        System.out.println("--------");
        List<Integer> list2 = bestSum(8, Arrays.asList(5, 3, 2));
        list2.forEach(num -> System.out.println(num));
        System.out.println("--------");
//        List<Integer> list3 = bestSum(100, Arrays.asList(1, 2, 5, 25));
//        list3.forEach(num -> System.out.println(num));
        System.out.println("Best sum memo");
        List<Integer> list3 = bestSumMemo(7, Arrays.asList(5, 3, 4, 7), new HashMap<>());
        list3.forEach(num -> System.out.println(num));
        System.out.println("--------");
        List<Integer> list4 = bestSumMemo(8, Arrays.asList(5, 3, 2), new HashMap<>());
        list4.forEach(num -> System.out.println(num));
        System.out.println("--------");
    }
}
