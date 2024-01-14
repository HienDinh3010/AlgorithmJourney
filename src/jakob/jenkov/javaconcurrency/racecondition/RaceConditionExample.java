package jakob.jenkov.javaconcurrency.racecondition;

public class RaceConditionExample {
    public static void main(String[] args) {
        CounterNonSynchronized counter = new CounterNonSynchronized();
        Thread thread1 = new Thread(getRunnable(counter, "Thread 1 final count: "));
        Thread thread2 = new Thread(getRunnable(counter, "Thread 2 final count: "));
        thread1.start();
        thread2.start();
    }

    public static Runnable getRunnable(CounterNonSynchronized counter, String message) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + counter.get());
        };
    }
}
