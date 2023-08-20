package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class No347_TopKFrequentElements {

  /**
   * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
   * Example 1:
   *
   * Input: nums = [1,1,1,2,2,3], k = 2
   * Output: [1,2]
   * @param nums
   * @param k
   * @return
   */
  public int[] topKFrequent(int[] nums, int k) {
    int len = nums.length;
    if (len < k) return null;
    //     <num, occur>
    HashMap<Integer, Integer> countMap = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    for (Integer n: nums) {
      countMap.put(n, countMap.getOrDefault(n, 1) + 1);
    }

    for (Entry<Integer, Integer> entry: countMap.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();
      list.add(value, key);
    }
    int[] res = new int[k];
    int index = list.size() - k;
    for (int i = 0; i < k; i++) {
      res[i] = list.get(index);
      index++;
    }
    return res;
  }
  public int[] topKFrequent2(int[] nums, int k) {
    int len = nums.length;
    if (len  < k) return null;
    Arrays.sort(nums);
    HashMap<CustomListKey, Integer> map = new HashMap<>();
    for (int i = 0; i < len - 1; i++) {
      for (int j = i + 1; j < len; j++) {
        CustomListKey key = new CustomListKey(Arrays.asList(nums[i], nums[j]));
        map.put(key, map.getOrDefault(key, 1) + 1);
      }
    }
    int maxV = 0;
    CustomListKey maxK = null;
    for (Entry<CustomListKey, Integer> entry: map.entrySet()) {
      if (entry.getValue() > maxV) {
        maxV = entry.getValue();
        maxK = entry.getKey();
      }
    }
    // Convert List<Integer> to int[]
    int[] intArray = new int[maxK.list.size()];
    for (int i = 0; i < maxK.list.size(); i++) {
      intArray[i] = maxK.list.get(i);
    }
    return intArray;
  }

  class CustomListKey {
    private final List<Integer> list;

    public CustomListKey(List<Integer> list) {
      this.list = list;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      CustomListKey that = (CustomListKey) o;
      return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
      return Objects.hash(list);
    }
  }

}
