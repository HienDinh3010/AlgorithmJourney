package com.assessment.com2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSetSizeForCoveringIntervalsTest {
    MinimumSetSizeForCoveringIntervals problem;

    @BeforeEach
    public void initialize() {
        problem = new MinimumSetSizeForCoveringIntervals();
    }

    @Test
    public void testCompare0() {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 3), Arrays.asList(2, 5), Arrays.asList(1, 4)
        );

        assertEquals(true, problem.compare(list.get(0), list.get(1)) < 0);
        Collections.sort(list, problem::compare);
        assertEquals(1, list.get(1).get(0));
        assertEquals(4, list.get(1).get(1));
    }

    @Test
    public void test() {
        int actual = problem.solution(Arrays.asList(
                Arrays.asList(1, 3), Arrays.asList(2, 5), Arrays.asList(1, 4)
        ));
        assertEquals(2, actual);
    }

    @Test
    public void test1() {
        int actual = problem.solution(Arrays.asList(
                Arrays.asList(3, 6), Arrays.asList(2, 4), Arrays.asList(0, 2), Arrays.asList(4, 7)
        ));
        assertEquals(4, actual);
    }

    @Test
    public void test2() {
        int actual = problem.solution(Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(3, 4), Arrays.asList(1, 3)
        ));
        assertEquals(4, actual);
    }

    @Test
    public void test3() {
        //[0, 3], [2, 6], [3, 4], [6, 9]
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(0, 3), Arrays.asList(2, 6), Arrays.asList(3, 4), Arrays.asList(6, 9)
        );
        assertEquals(5, problem.solution(list));
    }

    @Test
    public void compareTest2() {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(3, 4), Arrays.asList(1, 3)
        );
        Collections.sort(list, problem::compare);
        assertEquals(1, list.get(0).get(0));
        assertEquals(2, list.get(0).get(1));
        assertEquals(1, list.get(1).get(0));
        assertEquals(3, list.get(1).get(1));
    }
}
