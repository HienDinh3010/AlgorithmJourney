package leetcode.dynamicprogram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No53_MaximumSubarrayTest {

    No53_MaximumSubarray no53;

    @BeforeEach
    public void initialize() {
        no53 = new No53_MaximumSubarray();
    }

    @Test
    public void test00() {
        int actual = no53.maxSubArrayBruteforce(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, actual);
    }

    @Test
    public void test01() {
        int actual = no53.maxSubArrayBruteforce(new int[]{1});
        assertEquals(1, actual);
    }

    @Test
    public void test02() {
        int actual = no53.maxSubArrayBruteforce(new int[]{5, 4, -1, 7, 8});
        assertEquals(23, actual);
    }

    @Test
    public void testmaxSubArrayLinearSolution00() {
        int actual = no53.maxSubArrayLinearSolution(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, actual);
    }

    @Test
    public void testmaxSubArrayLinearSolution01() {
        int actual = no53.maxSubArrayLinearSolution(new int[]{1});
        assertEquals(1, actual);
    }

    @Test
    public void testmaxSubArrayLinearSolution02() {
        int actual = no53.maxSubArrayLinearSolution(new int[]{5, 4, -1, 7, 8});
        assertEquals(23, actual);
    }
}
