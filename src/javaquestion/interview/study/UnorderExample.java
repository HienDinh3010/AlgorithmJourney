package javaquestion.interview.study;

import java.util.*;

public class UnorderExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("z", "b", "a");
        list.forEach(System.out::println);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
