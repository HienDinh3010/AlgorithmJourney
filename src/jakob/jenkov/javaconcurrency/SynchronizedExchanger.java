package jakob.jenkov.javaconcurrency;

public class SynchronizedExchanger {
    protected Object object = null;

    public synchronized Object getObject() {
        return object;
    }

    public synchronized void setObject(Object object) {
        this.object = object;
    }

    public Object getObj() {
        synchronized (this) {
            return object;
        }
    }

    public void setObj(Object object) {
        synchronized (this) {
            this.object = object;
        }
    }
}
