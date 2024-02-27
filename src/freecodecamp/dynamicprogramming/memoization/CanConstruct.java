package freecodecamp.dynamicprogramming.memoization;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CanConstruct {
    static boolean canConstruct(String target, List<String> wordBank) {
        if (target.isEmpty()) return true;
        for (String word: wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                if(canConstruct(suffix, wordBank)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean canConstructMemo(String target, List<String> wordBank, HashMap<String, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return true;
        for (String word: wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                if(canConstruct(suffix, wordBank)) {
                    memo.put(suffix, true);
                    return true;
                }
            }
        }
        memo.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef",
                Arrays.asList("ab", "abc", "cd", "def", "abcd")));//true
        System.out.println(canConstruct("skateboard",
                Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "boar")));//false
        System.out.println(canConstruct("enterapotentpot",
                Arrays.asList("a", "p", "ent", "enter", "ot", "o", "t")));//true
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeef",
                Arrays.asList("e", "ee", "eee", "eeee", "eeeee", "eeeeee")));//false
        System.out.println("Memoization:");
        System.out.println(canConstructMemo("abcdef",
                Arrays.asList("ab", "abc", "cd", "def", "abcd"), new HashMap<>()));//true
    }
}
