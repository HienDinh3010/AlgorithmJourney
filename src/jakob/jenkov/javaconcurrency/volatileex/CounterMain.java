package jakob.jenkov.javaconcurrency.volatileex;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("call inc() method: " + counter.inc() + " count = " + counter.getCount());
    }
}
