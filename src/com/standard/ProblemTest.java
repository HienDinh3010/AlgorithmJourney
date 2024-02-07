package com.standard;

import com.assessment.versa.networks.FairIndexes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {
    FairIndexes problem;

    @BeforeEach
    public void initialize() {
        problem = new FairIndexes();
    }

    @Test
    public void test() {
        int actual = 0;// = problem.solution(new int[]{1, 3, 6, 4, 1, 2});
        assertEquals(5, actual);
    }
}
