package java.jakob.jenkov.javaconcurrency;

import java.util.function.Consumer;

public class SynchronizedLambda {

    private static Object object = null;

    public static synchronized void setObject(Object object) {
        SynchronizedLambda.object = object;
    }

    public static void consumeObject(Consumer consumer) {
        consumer.accept(object);
    }

    public static void main(String[] args) {
        consumeObject((obj) -> {
            synchronized (SynchronizedLambda.class) {
                System.out.println(obj);
            }
        });

        consumeObject( (obj) -> {
            synchronized (String.class) {
                System.out.println(obj);
            }
        });
    }
}
