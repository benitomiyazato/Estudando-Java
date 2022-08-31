package academy.devdojo.maratonajava.javacore.ZZGconcurrence.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service.StoreServiceWithDiscount;
import academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service.Quote;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount sswd = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsync(sswd);

    }

    public static void searchPricesWithDiscountAsync(StoreServiceWithDiscount sswd) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        stores.stream()
                .map(sswd::getPriceSync)
                .map(Quote::newQuote)
                .map(sswd::applyDescount)
                .forEach(System.out::println);
    }
}
