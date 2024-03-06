package java.jakob.jenkov.javaconcurrency.threadlocalex;

import java.util.Arrays;

public class ThreadLocalBasicExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Thread thread1 = new Thread(() -> {
            threadLocal.set("Thread 1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            String value = threadLocal.get();
            System.out.println(value);
        });

        Thread thread2 = new Thread(() -> {
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            String value = threadLocal.get();
            System.out.println(value);
        });

        thread1.start();
        thread2.start();
    }

    public int solution(int[] A) {
        // Implement your solution here
        int len = A.length;
        if (len == 0) return 1;
        Arrays.sort(A);
        int index = Arrays.binarySearch(A, 1);
        if (index != -1) return 1;
        int expected = 2;
        while (index < len) {
            index++;
            int elementAtIndex = A[index];
            if (elementAtIndex == expected) {
                expected++;
            } else {
                return expected;
            }
        }
        return 1;
    }
}
