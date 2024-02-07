package slidingWindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No209_MinimumSizeSubarraySumTest {
    No209_MinimumSizeSubarraySum problem;

    @BeforeEach
    public void initialize() {
        problem = new No209_MinimumSizeSubarraySum();
    }

    @Test
    public void test() {
        int actual = problem.solution(new int[]{2, 3, 1, 2, 4, 3}, 7);
        assertEquals(2, actual);
    }

    @Test
    public void test2() {
        int actual = problem.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        assertEquals(2, actual);
    }
}
