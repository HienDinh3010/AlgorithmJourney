package freecodecamp.dynamicprogramming.memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountConstruct {
    static int countConstruct(String target, List<String> wordBank) {
        if (target.isEmpty()) return 1;

        int totalCount = 0;

        for (String word: wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                int numWaysForRest = countConstruct(suffix, wordBank);
                totalCount += numWaysForRest;
            }
        }

        return totalCount;
    }

    static int countConstructMemo(String target, List<String> wordBank, HashMap<String, Integer> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return 1;

        int totalCount = 0;

        for (String word: wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                int numWaysForRest = countConstruct(suffix, wordBank);
                totalCount += numWaysForRest;
            }
        }
        memo.put(target, totalCount);
        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println(countConstruct("purple",
                Arrays.asList("purp", "p", "ur", "le", "purpl")));//2
        System.out.println(countConstructMemo("purple",
                Arrays.asList("purp", "p", "ur", "le", "purpl"), new HashMap<>()));//2
    }
}
