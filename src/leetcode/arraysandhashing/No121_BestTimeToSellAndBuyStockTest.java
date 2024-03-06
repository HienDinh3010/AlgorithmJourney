package leetcode.arraysandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No121_BestTimeToSellAndBuyStockTest {

    No121_BestTimeToSellAndBuyStock no121;

    @BeforeEach
    public void initialize() {
        no121 = new No121_BestTimeToSellAndBuyStock();
    }

    @Test
    public void test() {
        int actual = no121.maxProfit(new int[] {7,1,5,3,6,4});
        assertEquals(5, actual);
    }

    @Test
    public void test1() {
        int actual = no121.maxProfit(new int[] {7,6,4,3,1});
        assertEquals(0, actual);
    }

    @Test
    public void test2() {
        int actual = no121.maxProfit(new int[] {1,4,2});
        assertEquals(3, actual);
    }

    @Test
    public void test3() {
        int actual = no121.maxProfit(new int[] {2, 1});
        assertEquals(0, actual);
    }

    @Test
    public void test4() {
        int actual = no121.maxProfit(new int[] {3,2,6,5,0,3});
        assertEquals(4, actual);
    }


    @Test
    public void maxProfit1Test() {
        int actual = no121.maxProfit1(new int[] {7,1,5,3,6,4});
        assertEquals(5, actual);
    }

    @Test
    public void maxProfit1Test1() {
        int actual = no121.maxProfit1(new int[] {7,6,4,3,1});
        assertEquals(0, actual);
    }

    @Test
    public void maxProfit1Test2() {
        int actual = no121.maxProfit1(new int[] {1,4,2});
        assertEquals(3, actual);
    }

    @Test
    public void maxProfit1Test3() {
        int actual = no121.maxProfit1(new int[] {2, 1});
        assertEquals(0, actual);
    }

    @Test
    public void maxProfit1Test4() {
        int actual = no121.maxProfit1(new int[] {3,2,6,5,0,3});
        assertEquals(4, actual);
    }


    @Test
    public void maxProfit2Test() {
        int actual = no121.maxProfit2(new int[] {7,1,5,3,6,4});
        assertEquals(5, actual);
    }

    @Test
    public void maxProfit2Test1() {
        int actual = no121.maxProfit2(new int[] {7,6,4,3,1});
        assertEquals(0, actual);
    }

    @Test
    public void maxProfit2Test2() {
        int actual = no121.maxProfit2(new int[] {1,4,2});
        assertEquals(3, actual);
    }

    @Test
    public void maxProfit2Test3() {
        int actual = no121.maxProfit2(new int[] {2, 1});
        assertEquals(0, actual);
    }

    @Test
    public void maxProfit2Test4() {
        int actual = no121.maxProfit2(new int[] {3,2,6,5,0,3});
        assertEquals(4, actual);
    }
}
