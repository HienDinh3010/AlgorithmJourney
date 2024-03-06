package java.jakob.jenkov.javaconcurrency;

public class StaticSynchronizedExchangerMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    StaticSynchronizedExchanger.setObject(" " + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(StaticSynchronizedExchanger.getObject());
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
