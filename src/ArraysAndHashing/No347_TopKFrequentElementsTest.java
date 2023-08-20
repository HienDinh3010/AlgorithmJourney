package ArraysAndHashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No347_TopKFrequentElementsTest {
  No347_TopKFrequentElements no347;

  @BeforeEach
  public void initialize() {
    no347 = new No347_TopKFrequentElements();
  }

  @Test
  public void topKFrequentTest() {
    int[] actual = no347.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    assertEquals(1, actual[0]);
    assertEquals(2, actual[1]);
  }

  @Test
  public void topKFrequentTest1() {
    assertEquals(new int[]{1}, no347.topKFrequent(new int[]{1}, 1));
  }

  @Test
  public void topKFrequentTest2() {
    assertEquals(new int[]{4, 1}, no347.topKFrequent(new int[]{3, 1, 4, 4, 5, 2, 6, 1}, 2));
  }

  @Test
  public void topKFrequentTes3() {
    assertEquals(new int[]{5, 11, 7, 10}, no347.topKFrequent(new int[]{7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}, 4));
  }
}