package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 *
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 */
public class No15_3Sum {
  public List<List<Integer>> threeSum(int[] nums) {
    int len = nums.length;
    if (len < 3) return null;
    Arrays.sort(nums);
    HashMap<List<Integer>, List<Integer>> map = new HashMap<>();
    int l = 0, m = l + 1, r = len - 1;
    threeSum(map, nums, l, m, r);
    return map.values().stream().toList();
  }

  public void threeSum(HashMap<List<Integer>, List<Integer>> map, int[] nums, int l, int m, int r) {
    if (l > nums.length - 2) return;
    if (l > r - 1) {
      l = l + 1;
      m = l + 1;
      threeSum(map, nums, l, m, nums.length - 1);
    }
    if (m < r) {
      if (nums[l] + nums[m] + nums[r] == 0) {
        map.put(Arrays.asList(nums[l], nums[m], nums[r]), Arrays.asList(nums[l], nums[m], nums[r]));
        threeSum(map, nums, l, l + 1, r - 1);
      } else {
        threeSum(map, nums, l, m + 1, r);
      }
    } else {
      threeSum(map, nums, l, l + 1, r - 1);
    }
  }

  //bruteforce
  public List<List<Integer>> threeSum1(int[] nums) {
    int len = nums.length;
    if (len < 3) return null;
    Arrays.sort(nums);
    if (nums[0] > 0 || nums[len-1] < 0) return null;
    HashMap<List<Integer>, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < len - 2; i++) {
      for (int k = len - 1; k > i + 1; k--) {
        for (int j = i + 1; j < k; j++ ) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            map.put(Arrays.asList(nums[i], nums[j], nums[k]), Arrays.asList(nums[i], nums[j], nums[k]));
          }
        }
      }
    }
    return map.values().stream().toList();
  }

  //another way
  public List<List<Integer>> threeSum2(int[] nums) {
    int len = nums.length;
    if (len < 3) return null;
    Arrays.sort(nums);
    int min = nums[0];
    int max = nums[len - 1];
    if (min > 0 || max < 0) return null;
    HashMap<List<Integer>, List<Integer>> map = new HashMap<>();
    int l = 0, r = len - 1;
    while (l < len - 2) {
      int m = l + 1;
      while (m < r) {
        if (nums[l] + nums[m] + nums[r] == 0) {
          map.put(Arrays.asList(nums[l], nums[m], nums[r]), Arrays.asList(nums[l], nums[m], nums[r]));
          break;
        }
        m++;
      }
      r--;
      if (l >= r - 1) {
        l++;
        r = len - 1;
      }
    }
    return map.values().stream().toList();
  }

//  public void threeSum(List<List<Integer>> list, int[] nums, int l, int m, int r) {
//    if (l > nums.length - 2) return;
//    if (l > r - 1) {
//      threeSum(list, nums, l + 1, l + 2, nums.length - 1);
//    }
//    if (m < r) {
//      if (nums[l] + nums[m] + nums[r] == 0) {
//        list.add(Arrays.asList(nums[l], nums[m], nums[r]));
//        threeSum(list, nums, l, l + 1, r - 1);
//      } else {
//        threeSum(list, nums, l, m + 1, r);
//      }
//    } else {
//      threeSum(list, nums, l, l + 1, r - 1);
//    }
//  }
}
