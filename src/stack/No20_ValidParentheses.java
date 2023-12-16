package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static java.util.Map.entry;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 */
public class No20_ValidParentheses {
    public boolean isValid(String s) {
        char[] list = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeMap = new HashMap<>();
        closeMap.put(')', '(');
        closeMap.put('}', '{');
        closeMap.put(']', '[');

        for (int i = 0; i < list.length; i++) {
            char c = list[i];
            if (closeMap.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != closeMap.get(c)) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
