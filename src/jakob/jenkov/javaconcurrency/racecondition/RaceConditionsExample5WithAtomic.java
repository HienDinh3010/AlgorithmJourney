package jakob.jenkov.javaconcurrency.racecondition;

import java.util.Hashtable;

public class RaceConditionsExample5WithAtomic {
    public static void main(String[] args) {
        Hashtable<String, String> sharedMap = new Hashtable<>();
        Thread thread1 = new Thread(getRunnable(sharedMap));
        Thread thread2 = new Thread(getRunnable(sharedMap));
        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Hashtable<String, String> sharedMap) {
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                synchronized (sharedMap) {
                    if (sharedMap.contains("key")) {
                        String value = sharedMap.remove("key");
                        if (value == null) {
                            System.out.println(String.format("At index %d value for 'key' was null", i));
                        }
                    } else {
                        sharedMap.put("key", "value");
                    }
                }
            }
        };
    }
}
