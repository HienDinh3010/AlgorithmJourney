package jakob.jenkov.javaconcurrency.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample_InvokeAll {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> callables = new ArrayList<>();
        callables.add(newCallable("Task 1.1"));
        callables.add(newCallable("Task 1.2"));
        callables.add(newCallable("Task 1.3"));

        try {
            List<Future<String>> results = executorService.invokeAll(callables);
            for (Future future: results) {
                System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }

    private static Callable<String> newCallable(String msg) {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName() + ": " + msg;
            }
        };
    }

}
