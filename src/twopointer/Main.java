package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    No125_ValidPalindrome no125 = new No125_ValidPalindrome();
    System.out.println("no125 = " + no125.isPalindrome("A man, a plan, a canal: Panama"));

    System.out.println("no167 = ");
    No167_TwoSumII_InputArrayIsSorted no167 = new No167_TwoSumII_InputArrayIsSorted();
    Arrays.stream(no167.twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(num -> System.out.println(num + " "));

    System.out.println("Test HashMap input key as list");
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);

    List<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(2);
    list2.add(1);

    HashMap<List<Integer>, List<Integer>> map = new HashMap<>();
    map.put(list1, list1);
    map.put(list2, list2);
    System.out.println("Map size = " + map.size());
  }
}
