package jakob.jenkov.javaconcurrency.deadlock.preventionanddetection.lockreordering;

import java.util.concurrent.locks.Lock;

public class Runnable1 implements Runnable {

    private Lock lock1;

    private Lock lock2;

    public Runnable1(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to lock lock1");
        lock1.lock();
        System.out.println(threadName + " locked lock1");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(threadName + " attempting to lock lock2");
        lock2.lock();
        System.out.println(threadName + " locked lock2");

        lock1.unlock();
        lock2.unlock();
    }
}
