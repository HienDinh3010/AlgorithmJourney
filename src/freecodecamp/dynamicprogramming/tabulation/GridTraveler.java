package freecodecamp.dynamicprogramming.tabulation;

/**
 * Say that you are a traveler on a 2D grid. You begin in the top-left corner and
 * your goal is to travel to the bottom-right corner. You may only move down or right.
 * In how many ways can you travel to the goal on a grid with dimensions m * n?
 * gridTraveler(3,3) -> 6
 */
public class GridTraveler {
    static int gridTraveler(int m, int n) {
        int[][] table = new int[m + 1][n + 1];
        table[1][1] = 1;
        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <=n; j++) {
                int current = table[i][j];
                if (j + 1 <= n) table[i][j + 1] += current;
                if (i + 1 <= m) table[i + 1][j] += current;
            }
        }

        print(table, m, n);
        return table[m][n];
    }

    static void print(int[][] table, int m, int n) {
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        gridTraveler(3, 3);
    }
}
