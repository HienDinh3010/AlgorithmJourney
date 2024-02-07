package leetcode.topinterview150;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class No3_LongestSubstringWithoutRepeatingCharacters {
    public int solution(String s) {
        int start = 0, result = 0, len = s.length();
        Map<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char letter = s.charAt(i);
            if (seen.containsKey(letter) && seen.get(letter) >= start) {
                start = seen.get(letter) + 1;
            }

            result = Math.max(result, i - start + 1);
            seen.put(letter, i);
        }
        return result;
    }
}
