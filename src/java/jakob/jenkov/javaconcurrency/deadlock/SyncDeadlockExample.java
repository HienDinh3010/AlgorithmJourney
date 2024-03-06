package java.jakob.jenkov.javaconcurrency.deadlock;

public class SyncDeadlockExample {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable run1 = new SyncRunnable1(lock1, lock2);
        Runnable run2 = new SyncRunnable2(lock1, lock2);

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
    }
}
