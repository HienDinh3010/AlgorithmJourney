package company.assessment.com2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSetSizeForCoveringIntervalsTwoTest {
    MinimumSetSizeForCoveringIntervalsTwo problem;

    @BeforeEach
    public void initialize() {
        problem = new MinimumSetSizeForCoveringIntervalsTwo();
    }

    @Test
    public void test() {
        int[][] intervals = {{1, 3}, {2, 5}, {1, 4}};
        assertEquals(2, problem.solution(intervals));
    }

    @Test
    public void test1() {
        int[][] intervals = {{3, 6}, {2, 4}, {0, 2}, {4, 7}};
        assertEquals(4, problem.solution(intervals));
    }

    @Test
    public void test2() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        assertEquals(4, problem.solution(intervals));
    }

    @Test
    public void test3() {
        int[][] intervals = {{0, 3}, {2, 6}, {3, 4}, {6, 9}};
        assertEquals(5, problem.solution(intervals));
    }
}
