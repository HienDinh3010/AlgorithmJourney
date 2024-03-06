package leetcode.arraysandhashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No238_ProductofArrayExceptSelfTest {
  
  No238_ProductofArrayExceptSelf no238;

  @BeforeEach
  public void initialize() {
    no238 = new No238_ProductofArrayExceptSelf();
  }

  @Test
  public void productExceptSelfTest() {
    int[] act = no238.productExceptSelf(new int[]{1,2,3,4});
    assertEquals(24, act[0]);
    assertEquals(12, act[1]);
    assertEquals(8, act[2]);
    assertEquals(6, act[3]);
  }
}