package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class No217_ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    int len = nums.length;
    if (len < 2) return false;
    Arrays.sort(nums);
    for (int i = 0; i < len - 1; i++) {
      int element = nums[i];
      int find = Arrays.binarySearch(nums, i + 1, len, element);
      if (find >= 0) return true;
    }
    return false;
  }

  public boolean containsDuplicate2(int[] nums) {
    int len = nums.length;
    if (len < 2) return false;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      if (!map.keySet().contains(nums[i])) {
        map.put(nums[i], 1);
      } else {
        return true;
      }
    }
    return false;
  }
}
