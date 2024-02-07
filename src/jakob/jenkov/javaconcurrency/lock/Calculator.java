package jakob.jenkov.javaconcurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Calculator {
    public static class Calculation {
        enum Operator {
            UNSPECIFIED, ADDITION, SUBTRACTION
        }

        Operator type;

        public double value;

        public Calculation(Operator type, double value) {
            this.type = type;
            this.value = value;
        }
    }

    private double result = 0.0D;

    Lock lock = new ReentrantLock();

    public void add(double value) {
        try {
            lock.lock();
            result += value;
        } finally {
            lock.unlock();
        }
    }

    public void subtract(double value) {
        try {
            lock.lock();
            result -= value;
        } finally {
            lock.unlock();
        }
    }

    public void calculate(Calculation ... calculations) {
        try {
            lock.lock();
            for (Calculation calculation: calculations) {
                switch (calculation.type) {
                    case ADDITION : add(calculation.value); break;
                    case SUBTRACTION: subtract(calculation.value); break;
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
