package leetcode.arraysandhashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No49_GroupAnagramsTest {

  No49_GroupAnagrams no49;

  @BeforeEach
  public void initialize() {
    no49 = new No49_GroupAnagrams();
  }

  @Test
  public void groupAnagramsTest() {
    assertEquals(Arrays.asList(Arrays.asList("bat"), Arrays.asList("nat","tan"), Arrays.asList("ate","eat","tea"))
        , no49.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
  }
}