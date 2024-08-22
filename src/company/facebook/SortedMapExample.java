package company.facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, SortedMap<Integer, Integer>> map = new TreeMap<>();

        SortedMap<Integer, Integer> sm1 = new TreeMap<>();
        sm1.put(3, 2);
        sm1.put(-1, 8);
        map.put(1, sm1);

        SortedMap<Integer, Integer> sm2 = new TreeMap<>();
        sm2.put(-1, 9);
        map.put(-1, sm2);

        List<Integer> list = new ArrayList<>();
        map.get(1).values().forEach(v -> list.add(v));
        System.out.println(list);
    }
}
