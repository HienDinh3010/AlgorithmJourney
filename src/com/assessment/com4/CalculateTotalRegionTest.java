package com.assessment.com4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTotalRegionTest {
    CalculateTotalRegion problem;

    @BeforeEach
    public void initialize() {
        problem = new CalculateTotalRegion();
    }

    @Test
    public void test() {
        int actual = problem.solution(Arrays.asList(1, 2, 1));
        assertEquals(5, actual);
    }

    @Test
    public void test1() {
        int actual = problem.solution(Arrays.asList(1, 1, 1, 1));
        assertEquals(16, actual);
    }

    @Test
    public void test2() {
        int actual = problem.solution(Arrays.asList(3, 5, 6));
        assertEquals(6, actual);
    }
}
