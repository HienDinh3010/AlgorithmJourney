package leetcode.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No11_ContainerWithMostWaterTest {

  No11_ContainerWithMostWater no11;

  @BeforeEach
  public void initialize() {
    no11 = new No11_ContainerWithMostWater();
  }

  @Test
  public void maxAreaTest() {
    assertEquals(49, no11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
  }

  @Test
  public void maxAreaTest1() {
    assertEquals(14, no11.maxArea(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
  }

  @Test
  public void maxAreaTest2() {
    assertEquals(20, no11.maxArea(new int[]{4,2,0,3,2,5}));
  }
}