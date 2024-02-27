package freecodecamp.dynamicprogramming.tabulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a function howSum(targetSum, numbers) that takes in a
 * targetSum and an array of numbers as arguments.
 * The function should return an array containing any combination of elements that add up
 * to exactly the targetSum.
 * If there is no combination that adds up to the targetSum, the return null.
 * If there are multiple combinations possible, you may return any single one.
 */
public class HowSum {
    static List<Integer> howSum(int targetSum, int[] numbers) {
        List<List<Integer>> table = new ArrayList<>();
        table.add(0, new ArrayList<>());
        for (int i = 1; i <= targetSum; i++) {
            table.add(i, null);//fill all elements on the list by null except the first element
        }

        for (int i = 0; i <= targetSum; i++) {
            if (table.get(i) != null) {
                for (Integer num: numbers) {
                    if (i + num <= targetSum) {
                        List<Integer> list = new ArrayList<>(table.get(i));
                        list.add(num);
                        table.set(i + num, list);
                    }
                }
            }
        }
        return table.get(targetSum);
    }

    public static List<Integer> howSum2(int targetSum, int[] numbers) {
        List<List<Integer>> table = new ArrayList<>(Collections.nCopies(targetSum + 1, null));
        table.set(0, new ArrayList<>());

        for (int i = 0; i <= targetSum; i++) {
            if (table.get(i) != null) {
                for (int num : numbers) {
                    if (i + num <= targetSum) {
                        List<Integer> combination = new ArrayList<>(table.get(i));
                        combination.add(num);
                        table.set(i + num, combination);
                    }
                }
            }
        }

        return table.get(targetSum);
    }

    public static void main(String[] args) {
        howSum(7, new int[] {2, 3}).stream().forEach(num -> System.out.print(num + " "));
        System.out.println("");
        howSum2(7, new int[] {2, 3}).stream().forEach(num -> System.out.print(num + " "));
//        System.out.println("------");
//        howSum(7, new int[] {5, 3, 4, 7}).stream().forEach(num -> System.out.print(num + " "));
//        Optional.ofNullable(howSum(7, new int[] {5, 3, 4, 7})).ifPresent(
//                result -> result.stream().forEach(num -> System.out.print(num + " "))
//        );
//        System.out.println("------");
//        howSum(7, new int[] {2, 4}).stream().forEach(num -> System.out.print(num + " "));
//        System.out.println("-------");
//        howSum(8, new int[] {2, 3, 5}).stream().forEach(num -> System.out.print(num + " "));
//        System.out.println("-------");
        //howSum(300, new int[] {7, 14}).stream().forEach();
    }
}
