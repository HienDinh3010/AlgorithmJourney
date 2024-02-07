package leetcode.blind75;

import java.util.Arrays;
import java.util.Comparator;

public class No434_NonOverlappingIntervals {

    public int solution(int[][] intervals) {
        // Sort by ending time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prev = 0, count  = 1;
        // if end is same, sort by start, bigger start in front
        for(int i = 0; i < intervals.length; i ++) {
            if(intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                count ++;
            }
        }
        return intervals.length - count;
    }

    public int solutionNeetCode(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start > prevEnd) {
                prevEnd = end;
            } else {
                res++;
                prevEnd = Math.min(end, prevEnd);
            }
        }
        return res;
    }
}
