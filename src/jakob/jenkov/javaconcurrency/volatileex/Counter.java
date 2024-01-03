package jakob.jenkov.javaconcurrency.volatileex;

public class Counter {
    private volatile int count = 0;

    public int getCount() {
        return count;
    }

    public boolean inc() {
        if (this.count == 10) {
            return false;
        }
        this.count++;
        return true;
    }
}
