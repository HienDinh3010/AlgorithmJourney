package leetcode.arraysandhashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No242_ValidAnagramTest {
  No242_ValidAnagram no242;

  @BeforeEach
  public void initialize() {
    no242 = new No242_ValidAnagram();
  }

  @Test
  public void isAnagramTest() {
    assertEquals(true, no242.isAnagram("anagram", "nagaram"));
  }

  @Test
  public void isAnagramTest1() {
    assertEquals(false, no242.isAnagram("rat", "car"));
  }

  @Test
  public void isAnagramTest2() {
    assertEquals(false, no242.isAnagram("aacc", "ccac"));
  }
}