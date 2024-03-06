package java.jakob.jenkov.javaconcurrency.racecondition;

public class RaceConditionExample3 {
    public static void main(String[] args) {
        //Counter counter = new Counter();
        Counter counter = new CounterSynchronized();
        Thread thread1 = new Thread(getIncrementingRunnable(counter));
        Thread thread2 = new Thread(getReadingRunnable(counter));
        thread1.start();
        thread2.start();
    }

    private static Runnable getIncrementingRunnable(Counter counter) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println("Thead 1 final count: " + counter.get());
        };
     }

    private static Runnable getReadingRunnable(Counter counter) {
        return () -> {
          for (int i = 0; i < 5; i++) {
              try {
                  Thread.sleep(1);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              System.out.println("Thread2 count: " + counter.get());
          }
        };
    }
}
