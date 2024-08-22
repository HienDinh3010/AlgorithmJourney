package javaquestion.interview.mythread;

class SharedResource {
    private int data;
    private boolean dataAvailable = false;

    public synchronized void produce(int value) {
        while (dataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore interrupted status
            }
        }
        data = value;
        dataAvailable = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!dataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore interrupted status
            }
        }
        dataAvailable = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}
