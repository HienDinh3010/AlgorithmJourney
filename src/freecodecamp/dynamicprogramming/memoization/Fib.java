package freecodecamp.dynamicprogramming.memoization;

import java.util.HashMap;

public class Fib {

    /**
     * O(2^n) if n = 50 it is too big
     * @param n
     * @return
     */
    static int fib(int n) {
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Memoization
     *
     * @param n
     * @param memo
     * @return
     */
    static int fib(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1;
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }

    public static void main(String[] args) {
        Runnable run1 = () -> System.out.println(Thread.currentThread().getName() + " run1 :" + fib(50
        ));
        Runnable run2 = () -> System.out.println(Thread.currentThread().getName() + " run2 :" + fib(50, new HashMap<>()));
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
    }
}
