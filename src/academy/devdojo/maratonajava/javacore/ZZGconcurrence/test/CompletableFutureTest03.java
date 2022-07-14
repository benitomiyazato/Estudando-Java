package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service.StoreServiceDeprecated;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncFuture(storeService);
    }

    private static void searchPricesAsyncFuture(StoreServiceDeprecated storeService) {
        ExecutorService ex = Executors.newFixedThreadPool(4, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), ex))
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d\n", end - start);
    }
}