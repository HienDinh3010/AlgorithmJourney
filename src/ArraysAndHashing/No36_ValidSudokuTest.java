package ArraysAndHashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No36_ValidSudokuTest {

  No36_ValidSudoku no36;

  @BeforeEach
  public void initialize() {
    no36 = new No36_ValidSudoku();
  }

  @Test
  public void isValidSudokuTest() {
    String[][] input = {
        {"5","3",".",".","7",".",".",".","."},
        {"6",".",".","1","9","5",".",".","."},
        {".","9","8",".",".",".",".","6","."},
        {"8",".",".",".","6",".",".",".","3"},
        {"4",".",".","8",".","3",".",".","1"},
        {"7",".",".",".","2",".",".",".","6"},
        {".","6",".",".",".",".","2","8","."},
        {".",".",".","4","1","9",".",".","5"},
        {".",".",".",".","8",".",".","7","9"}
    };

    char[][] arr = new char[input.length][input[0].length];

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[0].length; j++) {
        arr[i][j] = input[i][j].charAt(0);
      }
    }

    // Print the char[][] array
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    assertEquals(true, no36.isValidSudoku(arr));
  }
}