package java.jakob.jenkov.javaconcurrency;

public class SyncCounterMain {
    public static void main(String[] args) {
        SyncCounter counter = new SyncCounter();

        Thread thread1 = new Thread(() -> {
           for (int i = 0; i < 1_000_000; i++) {
               counter.inc();
           }
            System.out.println(counter.get());
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.inc();
            }
            System.out.println(counter.get());
        });

        thread1.start();
        thread2.start();
    }
}
