package BinarySearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No704_BinarySearchTest {

    No704_BinarySearch no704;

    @BeforeEach
    public void initialize() {
        no704 = new No704_BinarySearch();
    }

    @Test
    public void test0() {
        int actual = no704.search(new int[]{-1,0,3,5,9,12}, 9);
        assertEquals(4, actual);
    }

    @Test
    public void test1() {
        int actual = no704.search(new int[]{-1,0,3,5,9,12}, 2);
        assertEquals(-1, actual);
    }
}
