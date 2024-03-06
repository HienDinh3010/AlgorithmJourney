package leetcode.dynamicprogram;

import java.util.Arrays;

public class No509_FibonacciNumber {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public int dynFib(int n) {
        if (n < 2) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <=n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public int solution(int[] A) {
        // Implement your solution here
        int len = A.length;
        if (len == 0) return 1;
        Arrays.sort(A);
        int index = Arrays.binarySearch(A, 1);
        if (index < 0) return 1;
        int currentElement, nextElement;;
        while (index < len - 1) {
            currentElement = A[index];
            nextElement = A[index+1];
            if (currentElement == nextElement || currentElement + 1 == nextElement) {
                index++;
            } else {
                return currentElement + 1;
            }

        }
        return 1;
    }
}
