package com.assessment.com4;

import java.util.List;

public class CalculateTotalRegion {
    public int solution(List<Integer> heights) {
        int sum = 0;
        for (int i = 0; i < heights.size(); i++) {
            int left = i;
            while (left > 0 && heights.get(left - 1) >= heights.get(i)) {
                left--;
            }

            int right = i;
            while (right < heights.size() - 1 && heights.get(right + 1) >= heights.get(i)) {
                right++;
            }

            int regionLength = (right - left + 1);
            sum += regionLength;
        }
        return sum;
    }
}
