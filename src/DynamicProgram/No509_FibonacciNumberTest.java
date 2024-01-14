package DynamicProgram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No509_FibonacciNumberTest {
    No509_FibonacciNumber no509;

    @BeforeEach
    public void initialize() {
        no509 = new No509_FibonacciNumber();
    }

    @Test
    public void test() {
        int actual = no509.solution(new int[]{1, 3, 6, 4, 1, 2});
        assertEquals(5, actual);
    }

    @Test
    public void test00() {
        int actual = no509.fib(0);
        assertEquals(0, actual);
    }

    @Test
    public void test01() {
        int actual = no509.fib(1);
        assertEquals(1, actual);
    }

    @Test
    public void test02() {
        int actual = no509.fib(2);
        assertEquals(1, actual);
    }

    @Test
    public void dynFibTest0() {
        int actual = no509.dynFib(2);
        assertEquals(1, actual);
    }

    @Test
    public void dynFibTest1() {
        int actual = no509.dynFib(3);
        assertEquals(3, actual);
    }
}
