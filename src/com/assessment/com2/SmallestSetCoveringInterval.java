package com.assessment.com2;

import java.util.Arrays;

public class SmallestSetCoveringInterval {
    public int solution(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b) -> a[1] - b[1]);
        int count = 0, busy[][] = new int[2][2];
        for (int[] x: intervals) {
            if (x[0] > busy[1][1]) {
                ++count;
                busy[1] = x;
            } else if (x[0] > busy[0][1]) {
                ++count;
                busy[0] = x;
                if (x[1] > busy[1][1]) {
                    int[] temp = busy[0];
                    busy[0] = busy[1];
                    busy[1] = temp;
                }
            }
        }
        return count;
    }
}
