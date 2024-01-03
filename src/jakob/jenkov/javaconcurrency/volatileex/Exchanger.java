package jakob.jenkov.javaconcurrency.volatileex;

public class Exchanger {
    private Object object = null;

    private volatile boolean hasNewObject = false;

    public Object getObject() {
        while (!this.hasNewObject) {
            // busy wait
        }
        Object returnValue = this.object;
        this.hasNewObject = false;
        return returnValue;
    }

    public void setObject(Object object) {
        this.object = object;
        this.hasNewObject = true;
    }
}
