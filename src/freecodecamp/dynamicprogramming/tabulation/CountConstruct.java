package freecodecamp.dynamicprogramming.tabulation;

/**
 * Write a function countConstruct(target, wordBank) that accepts a target string
 * and an array of strings
 * The function should return the number of ways that the 'target' can
 * be constructed by concatenating elements of the 'wordBank' array.
 * You may reuse elements of wordBank as many times as needed
 */
public class CountConstruct {
    static int countConstruct(String target, String[] wordBank) {
        int[] table = new int[target.length() + 1];
        table[0] = 1;//One way two make empty string
        for (int i = 0; i <= target.length(); i++) {
            for (String word: wordBank) {
                if ((i + word.length()) <= target.length()
                        && target.substring(i, i + word.length()).equals(word)) {
                    table[i + word.length()] += table[i];
                }
            }
        }
        return table[target.length()];
    }

    public static void main(String[] args) {
        System.out.println(countConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(countConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
    }
}
