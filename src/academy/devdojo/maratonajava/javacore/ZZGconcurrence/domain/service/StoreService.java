package academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreService {

    private static ExecutorService executor = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices for store %s\n", storeName);
        return priceGenerator();
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
        System.out.printf("Getting prices for store %s\n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    private double priceGenerator() {
        System.out.printf("%s generating price\n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown() {
        executor.shutdown();
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
