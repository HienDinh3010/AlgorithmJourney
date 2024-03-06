package java.jakob.jenkov.javaconcurrency.deadlock;

public class SyncRunnable1 implements Runnable {

    private Object lock1;

    private Object lock2;

    public SyncRunnable1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " attempting to lock lock1");
        synchronized (lock1) {
            System.out.println(threadName + " locked lock1");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(threadName + " attempting to lock lock2");
            synchronized (lock2) {
                System.out.println(threadName + " locked lock2");
                //do the work - now that both locks has been acquired
            }
            System.out.println(threadName + " unlocked lock2");
        }
        System.out.println(threadName + " unlocked lock1");
    }
}
