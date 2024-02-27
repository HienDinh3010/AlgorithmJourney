package com.assessment.com4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpOneOrPrimesTest {
    JumpOneOrPrimes problem;

    @BeforeEach
    public void initialize() {
        problem = new JumpOneOrPrimes();
    }

    @Test
    public void test() {
        int actual = problem.solution(Arrays.asList(0, -10, -20, -30, 50));
        assertEquals(40, actual);
    }

    @Test
    public void testAllSumScores() {
        List<Integer> actual = problem.allSumScores(Arrays.asList(0, -10, -20, -30, 50), Arrays.asList(1, 3), 0);
        assertEquals(-10, actual.get(0));
        assertEquals(40, actual.get(1));
        assertEquals(20, actual.get(2));
    }

    @Test
    public void testAllScoreWays() {
        List<List<Integer>> actual = problem.allScoreWays(Arrays.asList(0, -10, -20, -30, 50), Arrays.asList(1, 3), 0);
        assertEquals(1, actual.get(0).get(0));
        assertEquals(4, actual.get(0).get(3));
        assertEquals(1, actual.get(1).get(0));
        assertEquals(4, actual.get(1).get(1));
        assertEquals(3, actual.get(2).get(0));
        assertEquals(4, actual.get(2).get(1));
    }

    @Test
    public void testAllScoreWaysMemo() {
        List<List<Integer>> actual = problem.allScoreWaysMemo(
                Arrays.asList(0, -10, -20, -30, 50), Arrays.asList(1, 3), 0, new HashMap<>());
        assertEquals(1, actual.get(0).get(0));
        assertEquals(4, actual.get(0).get(3));
        assertEquals(1, actual.get(1).get(0));
        assertEquals(4, actual.get(1).get(1));
        assertEquals(3, actual.get(2).get(0));
        assertEquals(4, actual.get(2).get(1));
    }


    @Test
    public void testCountWays() {
        int actual = problem.countWays(Arrays.asList(0, -10, -20, -30, 50), Arrays.asList(1, 3), 0);
        assertEquals(3, actual);
    }

    @Test
    public void testCountWaysMemo() {
        int actual = problem.countWaysMemo(Arrays.asList(0, -10, -20, -30, 50), Arrays.asList(1, 3), 0, new HashMap<>());
        assertEquals(3, actual);
    }

    @Test
    public void test1() {
        int actual = problem.solution(Arrays.asList(0, -10, 100, -20));
        assertEquals(70, actual);
    }

    @Test
    public void test2() {
        int actual = problem.solution(Arrays.asList(0, -100, -100, -1, 0, -1));
        assertEquals(-1, actual);
    }

    @Test
    public void test3() {
        int actual = problem.solution(Arrays.asList(0, 1, 2, 3));
        assertEquals(6, actual);
    }
}
