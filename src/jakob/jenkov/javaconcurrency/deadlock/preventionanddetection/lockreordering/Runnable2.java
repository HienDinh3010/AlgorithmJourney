package jakob.jenkov.javaconcurrency.deadlock.preventionanddetection.lockreordering;

import java.util.concurrent.locks.Lock;

public class Runnable2 implements Runnable {
    private Lock lock1;

    private Lock lock2;

    public Runnable2(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
/*        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to lock lock2");
        lock2.lock();
        System.out.println(threadName + " locked lock2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(threadName + " attempting to lock lock1");
        lock1.lock();
        System.out.println(threadName + " locked lock1");

        lock2.unlock();
        lock1.unlock();*/

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

        System.out.println(threadName + " unlocking lock2");
        lock2.unlock();
        System.out.println(threadName + " unlocking lock1");
        lock1.unlock();
    }
}
