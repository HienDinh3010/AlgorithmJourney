package javaquestion.interview.mythread;

class MyThread extends Thread {
    public void run() {
        try {
            while (!isInterrupted()) {
                // Perform task
                System.out.println("Thread is running");

                // Simulate some work with sleep
                //Thread.sleep(1000);
            }
        } catch (Exception e) {
            // Thread was interrupted during sleep or wait
            System.out.println("Thread was interrupted");
        }
        // Cleanup and exit
        System.out.println("Thread is exiting");
    }
}


