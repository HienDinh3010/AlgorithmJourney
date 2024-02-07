package leetcode.topinterview150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No88_MergeSortedArrayTest {
    No88_MergeSortedArray no88;

    @BeforeEach
    public void initialize() {
        no88 = new No88_MergeSortedArray();
    }

    @Test
    public void test00() {
        int nums1[] = new int[]{1, 2, 3, 0, 0, 0};
        int nums2[] = new int[]{2, 5, 6};
        no88.merge(nums1, 3, nums2, 3);
        assertEquals(1, nums1[0]);
        assertEquals(3, nums1[3]);
        assertEquals(6, nums1[5]);
    }

    @Test
    public void test01() {
        int nums1[] = new int[]{0};
        int nums2[] = new int[]{1};
        no88.merge(nums1, 0, nums2, 1);
        assertEquals(1, nums1[0]);
    }
}
