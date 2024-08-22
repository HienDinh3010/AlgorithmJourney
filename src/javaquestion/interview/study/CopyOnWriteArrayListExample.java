package javaquestion.interview.study;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        Iterator<String> iterator = list.iterator();

        LinkedHashMap linkedHashMap = new LinkedHashMap();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");

        // Iterating over the list
        System.out.println("Initial list:");
        for (String element : list) {
            System.out.println(element);
        }

        // Modifying the list concurrently
        Thread writerThread = new Thread(() -> {
            //list
            list.add("D");// list1 copy of list
            list.remove("A");
            System.out.println("List modified by writer thread");
        });

        // Reading the list concurrently
        Thread readerThread = new Thread(() -> {
            for (String element : list) {
                System.out.println("Reader thread reads: " + element);
                try {
                    Thread.sleep(50); // Simulate some delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        //readerThread.start();
        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Final state of the list
        System.out.println("Final list:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
