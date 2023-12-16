package javamemorymodel.basic;

public class MyRunnable implements Runnable {

    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }
        System.out.println("Thread name: " + Thread.currentThread().getName() + " ; count = " + count);
    }
}
