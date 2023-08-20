package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No242_ValidAnagram {

  public boolean isAnagram(String s, String t) {
    int lenS = s.length(), lenT = t.length();
    if (lenS != lenT || lenS == 0 || lenT == 0) return false;
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    Arrays.sort(sArr);
    Arrays.sort(tArr);
    if (String.valueOf(sArr).equals(
        String.valueOf(tArr)
    )) return true;
    return false;
  }

  public boolean isAnagram2(String s, String t) {
    int lenS = s.length(), lenT = t.length();
    if (lenS != lenT || lenS == 0 || lenT == 0) return false;
    char[] sArr = s.toCharArray();
    HashMap<Character, Integer> sMap = new HashMap<>();
    char[] tArr = t.toCharArray();
    HashMap<Character, Integer> tMap = new HashMap<>();
    for (int i = 0 ; i < lenS; i++) {
      if (!sMap.containsKey(sArr[i])) {
        sMap.put(sArr[i], 1);
      } else {
        sMap.put(sArr[i], sMap.get(sArr[i]) + 1);
      }
      if (!tMap.containsKey(tArr[i])) {
        tMap.put(tArr[i], 1);
      } else {
        tMap.put(tArr[i], tMap.get(tArr[i]) + 1);
      }
    }
    for (Map.Entry<Character, Integer> entry: sMap.entrySet()) {
      if (tMap.containsKey(entry.getKey())) {
        int valueS = entry.getValue();
        int valueT = tMap.get(entry.getKey());
        if (valueS != valueT) {
          return false;
        }
      } else {
          return false;
      }
    }
    return true;
  }
}
