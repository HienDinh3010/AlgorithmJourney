package java.jakob.jenkov.javaconcurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExamples {
    public static void main(String[] args) {
        lockBasics();
    }

    private static void lockBasics() {
        Lock lock = new ReentrantLock(false);
        Runnable runnable = () -> {
            lockSleepUnlock(lock, 1000l);
        };

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");
        Thread thread3 = new Thread(runnable, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void lockSleepUnlock(Lock lock, long millis) {
        try {
            lock.lock();
            printThreadMsg(" holds the lock.");
            sleep(millis);
        }  finally {
            lock.unlock();
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printThreadMsg(String text) {
        System.out.println(Thread.currentThread().getName() + text);
    }
}
