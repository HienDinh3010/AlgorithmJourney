package leetcode.topinterview150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No3_LongestSubstringWithoutRepeatingCharactersTest {
    No3_LongestSubstringWithoutRepeatingCharacters problem;

    @BeforeEach
    public void initialize() {
        problem = new No3_LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void test() {
        int actual = problem.solution("abcabcbb");
        assertEquals(3, actual);
    }
}
