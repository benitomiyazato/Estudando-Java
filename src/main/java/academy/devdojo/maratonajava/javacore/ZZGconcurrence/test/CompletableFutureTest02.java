package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service.StoreService;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncFuture(storeService);
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());

        List<Double> storesPricesList = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(storesPricesList);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d\n", end - start);
        StoreService.shutdown();
    }
}
