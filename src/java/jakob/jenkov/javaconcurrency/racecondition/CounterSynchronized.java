package java.jakob.jenkov.javaconcurrency.racecondition;

public class CounterSynchronized extends Counter {

    private int count;
    public int incAndGet() {
        synchronized (this) {
            this.count++;
            return count;
        }
    }

    public int incAndGet(int amount) {
        this.count = this.count + amount;
        return count;
    }

    public int get() {
        synchronized (this) {
            return count;
        }
    }
}
