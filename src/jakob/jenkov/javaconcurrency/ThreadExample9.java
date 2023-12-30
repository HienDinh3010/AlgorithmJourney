package jakob.jenkov.javaconcurrency;

/**
 * The JVM is still ALIVE as long as there are still running threads
 */
public class ThreadExample9 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                sleep(1000);
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable, "My Thread");
        thread.start();
        thread.setDaemon(true);//Set thread as deamon thread to terminate thread automatically when all
        //sleep(4000);

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
