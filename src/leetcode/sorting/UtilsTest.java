package leetcode.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {

    @Test
    public void testRightShift00() {
        int[] nums = new int[]{15, 22, 26, 10, 44};
        Utils.rightShift(nums, 0, 3, 1);
        assertEquals(15, nums[1]);
        assertEquals(22, nums[2]);
        assertEquals(26, nums[3]);
        assertEquals(44, nums[4]);
    }
}
