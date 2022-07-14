package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service.StoreService;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncFuture(storeService);
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesAsyncCompletableFuture("Store 4");
        
        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());
        
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d\n", end - start);
        StoreService.shutdown();
    }
}
