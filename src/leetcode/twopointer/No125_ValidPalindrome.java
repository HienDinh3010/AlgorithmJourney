package leetcode.twopointer;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class No125_ValidPalindrome {

  public boolean isPalindrome(String s) {
    char[] arr = s.toLowerCase().strip().toCharArray();
    if (arr.length == 0)
      return false;
    int l = 0, r = arr.length - 1;
    boolean isPalindrome = true;

    while (l < r && isPalindrome) {
      char left = arr[l];
      char right = arr[r];

      if (!Character.isLetterOrDigit(left)) {
        l++;
        continue;
      }
      if (!Character.isLetterOrDigit(right)) {
        r--;
        continue;
      }
      if (left == right) {
        isPalindrome = true;
        l++;
        r--;
      } else {
        isPalindrome = false;
      }
    }
    return isPalindrome;
  }
}
