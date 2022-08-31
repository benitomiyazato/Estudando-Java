package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarValue = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 5.14D;
        });
    }
}
