package javaquestion.interview.mythread;

public class ThreadLocalExample {

    // Creating a thread local variable
    private static final ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

    public static void main(String[] args) {
        // Creating and starting multiple threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " initial value: " + threadLocal.get());

            // Increment the thread local variable
            threadLocal.set(threadLocal.get() + 1);

            System.out.println(Thread.currentThread().getName() + " updated value: " + threadLocal.get());
        }
    }
}
