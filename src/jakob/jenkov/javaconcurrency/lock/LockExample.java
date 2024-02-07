package jakob.jenkov.javaconcurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);//fairness should be guarantee or not?
        lock.lock();

        //do something

        lock.unlock();
    }
}
