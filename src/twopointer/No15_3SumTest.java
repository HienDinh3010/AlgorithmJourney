package twopointer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class No15_3SumTest {

  @Test
  public void threeSumTest() {
    assertEquals(Arrays.asList(Arrays.asList(-1,0,1), Arrays.asList(-1,-1,2)),
        (new No15_3Sum()).threeSum(new int[]{-1,0,1,2,-1,-4}));
  }

  @Test
  public void threeSumTest1() {
    assertEquals( new ArrayList<>(),
        (new No15_3Sum()).threeSum(new int[]{0,1,1}));
  }

  @Test
  public void threeSumTest2() {
    assertEquals(Arrays.asList(Arrays.asList(0,0,0)),
        (new No15_3Sum()).threeSum(new int[]{0, 0, 0}));
  }

  @Test
  public void threeSumTest3() {
    assertEquals(Arrays.asList(Arrays.asList(-2,0,2), Arrays.asList(-2,1,1)),
        (new No15_3Sum()).threeSum(new int[]{-2,0,1,1,2}));
  }

  @Test
  public void threeSumTest4() {
    assertEquals(Arrays.asList(Arrays.asList(-2,0,2), Arrays.asList(-2,1,1)),
        (new No15_3Sum()).threeSum(new int[]{34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,
            62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49}));
  }

  @Test
  public void threeSum1Test() {
    assertEquals(Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)),
        (new No15_3Sum()).threeSum1(new int[]{-1,0,1,2,-1,-4}));
  }

  @Test
  public void threeSum1Test1() {
    assertEquals( new ArrayList<>(),
        (new No15_3Sum()).threeSum1(new int[]{0,1,1}));
  }

  @Test
  public void threeSum1Test2() {
    assertEquals(Arrays.asList(Arrays.asList(0,0,0)),
        (new No15_3Sum()).threeSum1(new int[]{0, 0, 0}));
  }

  @Test
  public void threeSum1Test3() {
    assertEquals(Arrays.asList(Arrays.asList(-2,1,1), Arrays.asList(-2,0,2)),
        (new No15_3Sum()).threeSum1(new int[]{-2,0,1,1,2}));
  }

  @Test
  public void threeSum1Test4() {
    assertEquals(Arrays.asList(Arrays.asList(-2,0,2), Arrays.asList(-2,1,1)),
        (new No15_3Sum()).threeSum2(new int[]{34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,
            62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49}));
  }

  @Test
  public void threeSum2Test() {
    assertEquals(Arrays.asList(Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)),
        (new No15_3Sum()).threeSum2(new int[]{-1,0,1,2,-1,-4}));
  }

  @Test
  public void threeSum2Test1() {
    assertEquals( new ArrayList<>(),
        (new No15_3Sum()).threeSum2(new int[]{0,1,1}));
  }

  @Test
  public void threeSum2Test2() {
    assertEquals(Arrays.asList(Arrays.asList(0,0,0)),
        (new No15_3Sum()).threeSum2(new int[]{0, 0, 0}));
  }

  @Test
  public void threeSum2Test3() {
    assertEquals(Arrays.asList(Arrays.asList(-2,1,1), Arrays.asList(-2,0,2)),
        (new No15_3Sum()).threeSum2(new int[]{-2,0,1,1,2}));
  }

  @Test
  public void threeSum2Test4() {
    assertEquals(Arrays.asList(Arrays.asList(-2,0,2), Arrays.asList(-2,1,1)),
        (new No15_3Sum()).threeSum2(new int[]{34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,
            62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49}));
  }
}