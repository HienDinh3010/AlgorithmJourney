package javaquestion.interview.anonymousclass;

/**
 * Example for how anonymous class using on Functional Interface
 */
public class ThreadCreation {

    static {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Creating a thread...");
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args, String s) {
        System.out.println("hello");
    }
}
