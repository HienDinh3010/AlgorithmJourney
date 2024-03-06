package leetcode.arraysandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No34_FindFirstAndLastPositionOfElementInSortedArrayTest {
    No34_FindFirstAndLastPositionOfElementInSortedArray no34;

    @BeforeEach
    public void initialize() {
        no34 = new No34_FindFirstAndLastPositionOfElementInSortedArray();
    }

    @Test
    public void testBinarySearch00() {
        int actual = no34.binarySearch(new int[]{5,7,7,8,10}, 8, 0, 4);
        assertEquals(3, actual);
    }

    @Test
    public void testBinarySearch02() {
        int actual = no34.binarySearch(new int[]{5,7,7,8,10}, 5, 0, 4);
        assertEquals(0, actual);
    }

    @Test
    public void testBinarySearch03() {
        int actual = no34.binarySearch(new int[]{5,7,7,8,10}, 10, 0, 4);
        assertEquals(4, actual);
    }

    @Test
    public void testBinarySearch04() {
        int actual = no34.binarySearch(new int[]{5,7,7,8, 8,10}, 8, 0, 5);
        assertEquals(4, actual);
    }

    @Test
    public void test00() {
        int[] actual = no34.searchRange(new int[]{5,7,7,8,8,10}, 8);
        assertEquals(3, actual[0]);
        assertEquals(4, actual[1]);
    }
}
