package leetcode.twopointer;

/**
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container,
 * such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by
 * array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * Example 2:
 *
 * Input: height = [1,1]
 * Output: 1
 */
public class No11_ContainerWithMostWater {

  public int maxArea(int[] height) {
    int len = height.length;
    if (len == 0) return 0;
    if (len == 1) return height[0];
    int l = 0, r = len - 1;
    int max = 0;
    while (l < r) {
      int temp = Math.min(height[l], height[r]) * (r - l);
      if (max < temp) {
        max = temp;
      }
      if (height[l] >= height[r]) {
        r--;
      } else {
        l++;
      }
    }
    return max;
  }
}
