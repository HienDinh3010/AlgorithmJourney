package leetcode.blind75;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No434_NonOverlappingIntervalsTest {
    No434_NonOverlappingIntervals problem;

    @BeforeEach
    public void initialize() {
        problem = new No434_NonOverlappingIntervals();
    }

    @Test
    public void test() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int actual = problem.solution(intervals);
        assertEquals(1, actual);
    }

    @Test
    public void test2() {
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        int actual = problem.solution(intervals);
        assertEquals(2, actual);
    }

    @Test
    public void test3() {
        int[][] intervals = {{1, 2}, {2, 3}};
        int actual = problem.solution(intervals);
        assertEquals(0, actual);
    }
}
