package java.jakob.jenkov.javaconcurrency.racecondition;

public class CounterNonSynchronized extends Counter {

    private int count;
    public int incAndGet() {
        this.count++;
        return count;
    }

    public int incAndGet(int amount) {
        this.count = this.count + amount;
        return count;
    }

    public int get() {
        return count;
    }
}
