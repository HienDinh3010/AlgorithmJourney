package jakob.jenkov.javaconcurrency.executor;

import java.util.concurrent.*;

public class ExecutorServiceExample8 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future future = executorService.submit(newCallable("Task 1.1"));

        System.out.println(future.isDone());

        boolean mayInterrupt = false;
        boolean wasCancelled = future.cancel(mayInterrupt);
        System.out.println(wasCancelled);

        try {
            String result = (String) future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (CancellationException e) {
            String msg = "Cannot call Future.get() since task was cancelled";
            System.out.println(msg);
        }
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
        executorService.shutdown();
    }

    private static Callable newCallable(String msg) {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                return Thread.currentThread().getName() + ": " + msg;
            }
        };
    }
}
