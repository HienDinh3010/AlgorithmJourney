package com.assessment.com4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class JumpOneOrPrimes {

    public int solution(List<Integer> cells) {
        List<Integer> jumps = new ArrayList<>();
        jumps.add(1);
        for (int i = 2; i < cells.size();i ++) {
            if (isPrime(i)) jumps.add(i);
        }
        //return maxScore(cells, jumps, 0);
        return maxGameScore(cells, jumps);
    }

    public static int maxGameScore(List<Integer> cells, List<Integer> jumpSteps) {
        int n = cells.size();
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = cells.get(0);

        for (int i = 1; i < n; i++) {
            for (int p : jumpSteps) {
                if (i - p >= 0) {
                    dp[i] = Math.max(dp[i], dp[i - p] + cells.get(i));
                }
            }
            dp[i] = Math.max(dp[i], dp[i - 1] + cells.get(i));
        }

        return dp[n - 1];
    }

    public int maxScore(List<Integer> cells, List<Integer> steps, int jumpIndex) {
        List<List<Integer>> allScoreWays = allScoreWays(cells, steps, jumpIndex);
        int max = Integer.MIN_VALUE;
        for (List<Integer> list: allScoreWays) {
            int sum = list.stream().map(index -> cells.get(index)).mapToInt(Integer::intValue).sum();
            max = Integer.max(sum, max);
        }
        return max;
    }

    public List<Integer> allSumScores(List<Integer> cells, List<Integer> steps, int jumpIndex) {
        if (jumpIndex == cells.size() - 1) return new ArrayList<>();
        if (jumpIndex >= cells.size() - 1) return null;

        List<Integer> result = new ArrayList<>();

//        for (Integer step: steps) {
//            List<Integer> scores = allSumScores(cells, steps, jumpIndex + step);
//
//            result.addAll(combineScore);
//        }
        return result;
    }
    public List<List<Integer>> allScoreWays(List<Integer> cells, List<Integer> steps, int jumpIndex) {
        if (jumpIndex == cells.size() - 1) return Arrays.asList(Arrays.asList());
        if (jumpIndex > cells.size() - 1) return null;

        List<List<Integer>> result = new ArrayList<>();

        for (Integer step: steps) {
            List<List<Integer>> ways = allScoreWays(cells, steps, jumpIndex + step);
            List<List<Integer>> targetWays;
            if (ways != null) {
                targetWays = ways.stream()
                        .map(innnerList -> {
                            List<Integer> newList = new ArrayList<>();
                            newList.add(jumpIndex + step);
                            newList.addAll(innnerList);
                            return newList;
                        }).collect(Collectors.toList());
                result.addAll(targetWays);
            }
        }
        return result;
    }

    public List<List<Integer>> allScoreWaysMemo(List<Integer> cells, List<Integer> steps, int jumpIndex,
                                                HashMap<Integer, List<List<Integer>>> memo) {
        if (memo.containsKey(jumpIndex)) return memo.get(jumpIndex);
        if (jumpIndex == cells.size() - 1) return Arrays.asList(Arrays.asList());
        if (jumpIndex > cells.size() - 1) return null;

        List<List<Integer>> result = new ArrayList<>();

        for (Integer step: steps) {
            List<List<Integer>> ways = allScoreWays(cells, steps, jumpIndex + step);
            List<List<Integer>> targetWays;
            if (ways != null) {
                targetWays = ways.stream()
                        .map(innnerList -> {
                            List<Integer> newList = new ArrayList<>();
                            newList.add(jumpIndex + step);
                            newList.addAll(innnerList);
                            return newList;
                        }).collect(Collectors.toList());
                result.addAll(targetWays);
            }
        }
        memo.put(jumpIndex, result);
        return result;
    }

    public int countWays(List<Integer> cells, List<Integer> steps, int jumpIndex) {
        if (jumpIndex == cells.size() - 1) return 1;
        if (jumpIndex > cells.size() - 1) return 0;

        int totalCount = 0;

        for (Integer step: steps) {
            int numWaysForRest = countWays(cells, steps, jumpIndex + step);
            totalCount += numWaysForRest;
        }
        return totalCount;
    }

    public int countWaysMemo(List<Integer> cells, List<Integer> steps, int jumpIndex, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(jumpIndex)) return memo.get(jumpIndex);
        if (jumpIndex == cells.size() - 1) return 1;
        if (jumpIndex > cells.size() - 1) return 0;

        int totalCount = 0;

        for (Integer step: steps) {
            int numWaysForRest = countWays(cells, steps, jumpIndex + step);
            totalCount += numWaysForRest;
        }
        memo.put(jumpIndex, totalCount);
        return totalCount;
    }

    public boolean isPrime(int n) {
        if (n <= 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
