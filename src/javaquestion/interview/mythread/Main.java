package javaquestion.interview.mythread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        // Allow thread to run for a while
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread
        thread.interrupt();
    }
}
