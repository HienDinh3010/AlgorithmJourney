package freecodecamp.dynamicprogramming.tabulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BestSum {

    static List<Integer> bestSum(int targetSum, int[] numbers) {
        List<List<Integer>> table = new ArrayList<>(Collections.nCopies(targetSum + 1, null));
        table.set(0, new ArrayList<>());
        for (int i = 0; i <= targetSum; i++) {
            if (table.get(i) != null) {
                for (Integer num: numbers) {
                    List<Integer> combination = new ArrayList<>(table.get(i));
                    combination.add(num);
                    // if this current combination is shorter than what is already stored
                    if (i + num <= targetSum) {
                        if (table.get(i + num) == null || table.get(i + num).size() > combination.size()) {
                            table.set(i + num, combination);
                        }
                    }
                }
            }
        }
        return table.get(targetSum);
    }

    public static void main(String[] args) {
        Optional.ofNullable(bestSum(7, new int[] {5, 3, 4, 7})).ifPresent(num -> {
            System.out.print(num + " ");
        });
        System.out.println();
        Optional.ofNullable(bestSum(8, new int[] {2, 3, 5})).ifPresent(num -> {
            System.out.print(num + " ");
        });
        System.out.println();
        Optional.ofNullable(bestSum(8, new int[] {1, 4, 5})).ifPresent(num -> {
            System.out.print(num + " ");
        });
    }
}
