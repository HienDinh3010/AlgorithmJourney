package jakob.jenkov.javaconcurrency;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample2 {

    public static void main(String[] args) {
        List<Thread> vThreads = new ArrayList<>();
        int vTheadCount = 100_000;

        for (int i = 0; i < vTheadCount; i++) {
            int vTheadIndex = i;
            Thread vThread = Thread.ofVirtual().start(() -> {
                int result = 1;
                for (int j = 0; j < 10; j++) {
                    result = result * (j + 1);
                }
                System.out.println("Result["+vTheadIndex+"]: " + result);
            });
            vThreads.add(vThread);
        }

        for (int i = 0; i < vThreads.size(); i++) {
            try {
                vThreads.get(i).join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
