package leetcode.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class No36_ValidSudoku {
  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      Set<String> set = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.') {
          String num = String.valueOf(board[i][j]);
          if (set.contains(num)) {
            return false;
          }
        }
      }
    }

    for (int i = 0; i < 9; i++) {
      Set<String> set = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[j][i] != '.') {
          String num = String.valueOf(board[i][j]);
          if (set.contains(num)) {
            return false;
          }
        }
      }
    }

    return true;
  }
}
