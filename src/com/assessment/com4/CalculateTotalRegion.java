package com.assessment.com4;

import java.util.List;

public class CalculateTotalRegion {
    public int solution(List<Integer> heights) {
        int totalRegionSum = 0;

        for (int i = 0; i < heights.size(); i++) {
            int left = i;
            int right = i;
            int height = heights.get(i);

            // Expand to the left
            while (left - 1 >= 0 && heights.get(left - 1) <= height) {
                left--;
            }

            // Expand to the right
            while (right + 1 < heights.size() && heights.get(right + 1) <= height) {
                right++;
            }

            // Calculate the region size and add to the sum
            totalRegionSum += (right - left + 1);
        }

        return totalRegionSum;
    }
}
