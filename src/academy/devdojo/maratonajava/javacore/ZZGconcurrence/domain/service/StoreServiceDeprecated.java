package academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceDeprecated {
    public double getPriceSync(String storeName) {
        System.out.printf("Getting prices for store %s\n", storeName);
        return priceGenerator();
    }

    private double priceGenerator() {
        System.out.printf("%s generating price\n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
