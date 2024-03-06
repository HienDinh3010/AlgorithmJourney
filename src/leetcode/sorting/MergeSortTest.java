package leetcode.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    MergeSort mergeSort;

    @BeforeEach
    public void initialize() {
        mergeSort = new MergeSort();
    }

    @Test
    public void test00() {
        int nums[] = new int[]{22, 15, 26, 44, 10};
        mergeSort.mergeSort(nums);
        assertEquals(10, nums[0]);
        assertEquals(22, nums[2]);
        assertEquals(44, nums[4]);
    }
}
