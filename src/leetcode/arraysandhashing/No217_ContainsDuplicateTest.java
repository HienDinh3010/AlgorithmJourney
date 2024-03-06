package leetcode.arraysandhashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No217_ContainsDuplicateTest {

    No217_ContainsDuplicate no217;
    @BeforeEach
    public void initialize() {
        no217 = new No217_ContainsDuplicate();
    }

    @Test
    public void containsDuplicateTest() {
      assertEquals(true, no217.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    public void containsDuplicateTest1() {
      assertEquals(false, no217.containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void containsDuplicateTest2() {
      assertEquals(true, no217.containsDuplicate(new int[]{3,3}));
    }
}