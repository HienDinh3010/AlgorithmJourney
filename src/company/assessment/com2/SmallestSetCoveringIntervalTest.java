package company.assessment.com2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestSetCoveringIntervalTest {
    SmallestSetCoveringInterval problem;

    @BeforeEach
    public void initialize() {
        problem = new SmallestSetCoveringInterval();
    }

    @Test
    public void test() {
        int[][] intervals = {{1,3}, {2,5}, {1, 4}};
        int actual = problem.solution(intervals);
        assertEquals(2, actual);
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
        //[0, 3], [2, 6], [3, 4], [6, 9]
        int[][] intervals = {{0, 3}, {2, 6}, {3, 4}, {6, 9}};
        assertEquals(5, problem.solution(intervals));
    }
}
