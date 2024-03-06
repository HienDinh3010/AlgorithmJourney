package java.jakob.jenkov.javaconcurrency;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hi I am a Simple Thread");
    }

    public static void main(String[] args) {
        SimpleThread s = new SimpleThread();
        s.start();
    }
}
