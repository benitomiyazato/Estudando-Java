package academy.devdojo.maratonajava.javacore.ZZGconcurrence.domain.service;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    public String getPriceSync(String storeName) {
        System.out.printf("Getting prices for store %s\n", storeName);
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code
                .values()[(ThreadLocalRandom.current().nextInt(Discount.Code.values().length))];
        return String.format(Locale.US, "%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDescount(Quote quote) {
        delay();
        double descountValue;
        if (quote.getDiscount().getPercentage() == 0) {
            descountValue = quote.getPrice();
        } else {
            descountValue = quote.getPrice() * (quote.getDiscount().getPercentage() / 100);
        }
        return String.format(Locale.US, "'%s' original price: '%.2f. Applying discount code %s. Final Price '%.2f''",
                quote.getStoreName(), quote.getPrice(), quote.getDiscount(), descountValue);
    }

    private double priceGenerator() {
        System.out.printf("%s generating price\n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
