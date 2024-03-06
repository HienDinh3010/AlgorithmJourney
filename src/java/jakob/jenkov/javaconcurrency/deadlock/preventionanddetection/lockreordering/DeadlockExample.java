package java.jakob.jenkov.javaconcurrency.deadlock.preventionanddetection.lockreordering;

import java.jakob.jenkov.javaconcurrency.deadlock.Runnable1;
import java.jakob.jenkov.javaconcurrency.deadlock.Runnable2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Runnable runnable1 = new Runnable1(lock1, lock2);
        Runnable runnable2 = new Runnable2(lock1, lock2);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
