package jakob.jenkov.javaconcurrency;

public class SyncCounter {
    private long count = 0;

    public void inc() {
        synchronized (this) {
            this.count++;
        }
    }

    public long get() {
        synchronized (this) {
            return this.count;
        }
    }
}
