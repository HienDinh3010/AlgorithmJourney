package jakob.jenkov.javaconcurrency;

public class MixedSynchronization {
    public static Object staticObj = null;

    public static synchronized void setStaticObj(Object staticObj) {
        MixedSynchronization.staticObj = staticObj;
    }

    public Object instanceObj = null;

    public synchronized void setInstanceObj(Object instanceObj) {
        this.instanceObj = instanceObj;
    }
}
