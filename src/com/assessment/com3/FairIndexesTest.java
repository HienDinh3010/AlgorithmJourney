package com.assessment.com3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FairIndexesTest {
    FairIndexes problem;

    @BeforeEach
    public void initialize() {
        problem = new FairIndexes();
    }

    @Test
    public void test() {
        int actual = problem.countIndexes(new int[]{-5, 5, -3, 7, -4}, new int[]{5, -5, 3, -1, -2});
        assertEquals(2, actual);
    }

    @Test
    public void test1() {
        int actual = problem.countIndexes(new int[]{-4, 2, 2, -7, 3, 4, 9, -9}, new int[]{-11, 2, 9, -1, 0, 1, 21, -21});
        assertEquals(3, actual);
    }
}
