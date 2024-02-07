package com.assessment.pureintegration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumSetSizeForCoveringIntervals {

    public int compare(List<Integer> a, List<Integer> b) {
        if (a.get(1).equals(b.get(1))) {
            return a.get(0).compareTo(b.get(0));
        } else {
            return a.get(1).compareTo(b.get(1));
        }
    }

    public int solution(List<List<Integer>> intervals) {
        int n = intervals.size();

        Collections.sort(intervals, this::compare);
        List<Integer> res = new ArrayList<>();
        res.add(intervals.get(0).get(1) - 1);
        res.add(intervals.get(0).get(1));

        for (int i = 1; i < n; i++) {
            int start = intervals.get(i).get(0);
            int end = intervals.get(i).get(1);

            if (start > res.get(res.size() - 1)) {
                res.add(end - 1);
                res.add(end);
            } else if (start > res.get(res.size() - 2)) {
                res.add(end);
            }
        }
        return res.size();
    }
}
