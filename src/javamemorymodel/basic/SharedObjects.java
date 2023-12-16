package javamemorymodel.basic;

public class SharedObjects {
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();
    }
}
