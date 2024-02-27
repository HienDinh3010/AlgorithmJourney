package freecodecamp.dynamicprogramming.memoization;

import java.util.HashMap;

/**
 * Say that you are a traveler on a 2D grid.
 * You begin in the top-left corner and your goal is to travel to the bottom-right corner.
 * You may only move down or right.
 * In how many ways can you travel to the goal on a grid with dimensions m * n
 */
public class GridTraveler {
    static int gridTraveler(int m, int n) {
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        return gridTraveler(m - 1, n) + gridTraveler(m, n - 1);
    }

    static int gridTravelerMemorize(int m, int n, HashMap<String, Integer> memo) {
        String key = m + "," + n;
        if (memo.containsKey(key)) return memo.get(key);
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        memo.put(key, gridTravelerMemorize(m - 1, n, memo) + gridTravelerMemorize(m, n - 1, memo));
        return memo.get(key);
    }

    public static void main(String[] args) {
//        System.out.println(gridTraveler(2, 3));
//        System.out.println(gridTraveler(3, 2));
//        System.out.println(gridTraveler(3, 3));
//        System.out.println(gridTraveler(18, 18));
        System.out.println("---Memo---");
        System.out.println(gridTravelerMemorize(2, 3, new HashMap<String, Integer>()));
        System.out.println(gridTravelerMemorize(3, 2, new HashMap<String, Integer>()));
        System.out.println(gridTravelerMemorize(3, 3, new HashMap<String, Integer>()));
        System.out.println(gridTravelerMemorize(8, 8, new HashMap<String, Integer>()));
    }
}
