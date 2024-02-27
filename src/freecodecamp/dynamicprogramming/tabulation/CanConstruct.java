package freecodecamp.dynamicprogramming.tabulation;

/**
 * Write a function canConstruct(target, wordBank) that accepts a
 * target string and an array of strings.
 * The function should return a boolean indicating whether or not the target
 * can be constructed by concatenating elements of the wordBank array
 * You may reuse elements of wordBank as many times as needed
 */
public class CanConstruct {

    static boolean canConstruct(String target, String[] wordBank) {
        boolean[] table = new boolean[target.length() + 1];
        table[0] = true;
        for (int i = 0; i <= target.length(); i++) {
            if (table[i]) {
                for (String word: wordBank) {
                    // if the word matches the characters starting at position i
                    if (i + word.length() <= target.length() && target.substring(i, i + word.length()).equals(word)) {
                        table[i + word.length()] = true;
                    }
                }
            }
        }
        return table[target.length()];
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));//true
        //TODO: It returns true for below case:
        System.out.println(canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "board"}));//false
        System.out.println(canConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));//true
    }
}
