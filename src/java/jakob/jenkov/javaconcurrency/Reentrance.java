package java.jakob.jenkov.javaconcurrency;

public class Reentrance {
    private int count = 0;

    public synchronized void inc() {
        this.count++;
    }

    public synchronized int incAndGet() {
        inc();
        return this.count;
    }
}
