package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

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
    if (len == 1 && k == 1) return new int[]{nums[0]};
    HashMap<Integer, Integer> countMap = new HashMap<>();
    HashMap<Integer, List<Integer>> bucketMap = new HashMap<>();
    //TreeMap<Integer, List<Integer>> bucketMap = new TreeMap<>();
    for (Integer n: nums) {
      countMap.put(n, countMap.getOrDefault(n, 0) + 1);
    }

    for (Entry<Integer, Integer> entry: countMap.entrySet()) {
      int num = entry.getKey();
      int occur = entry.getValue();
      List<Integer> existedList = bucketMap.getOrDefault(occur, new ArrayList<>());
      existedList.add(num);
      bucketMap.put(occur, existedList);
    }

    int[] res = new int[k];
    int index = 0;
    List<List<Integer>> bucketValues = bucketMap.values().stream().toList();
    for (int i = bucketMap.size() - 1; i >= 0; i--) {
      List<Integer> list = bucketValues.get(i);
      for (Integer num: list) {
        res[index] = num;
        index++;
        if (index == k) return res;
      }
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
