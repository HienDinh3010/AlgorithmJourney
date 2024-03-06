package leetcode.arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class No49_GroupAnagrams {
  //"eat","tea","tan","ate","nat","bat"
  public List<List<String>> groupAnagrams(String[] strs) {
    int len = strs.length;
    if (len == 0) return null;
    if (len == 1) return Arrays.asList(Arrays.asList(strs[0]));
    HashMap<String, List<String>> map = new HashMap<>();

    for (String s: strs) {
      char[] sArr = s.toCharArray();
      Arrays.sort(sArr);
      String sortStr = String.valueOf(sArr);
      List<String> list;
      if (!map.containsKey(sortStr)) {
        list = new ArrayList<>();
      } else {
        list = map.get(sortStr);
      }
      list.add(s);
      map.put(sortStr, list);
    }
    return map.values().stream().toList();
  }
}
