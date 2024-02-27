package freecodecamp.dynamicprogramming.memoization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllConstruct {

    static List<List<String>> allConstruct(String target, List<String> wordBank) {
        if (target.isEmpty()) return Arrays.asList(new ArrayList<>());

        List<List<String>> result = new ArrayList<>();

        for (String word: wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = allConstruct(suffix, wordBank);
                List<List<String>> targetWays = suffixWays.stream()
                        .map(innerList -> {
                            List<String> newList = new ArrayList<>();
                            newList.add(word);
                            newList.addAll(innerList);
                            return newList;
                        })
                        .collect(Collectors.toList());
                result.addAll(targetWays);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        allConstruct("purple", Arrays.asList("purp", "p", "ur", "le", "purpl")).forEach(
                way -> {
                    System.out.println("[");
                    way.forEach(w -> System.out.println(w));
                    System.out.println("]");
                }
        );

    }
}
