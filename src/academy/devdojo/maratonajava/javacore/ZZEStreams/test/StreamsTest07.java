package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;

public class StreamsTest07 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00),
            new LightNovel("FullMetal Alchemist", 5.99)));

    public static void main(String[] args) {
        Double priceSum = lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(0.0, Double::sum);

        System.out.println(priceSum);

        /* -------------------------------------- */

        Double priceSumPerformance = lightNovels.stream() // para melhor performance utilizar DoubleStream
                .mapToDouble(LightNovel::getPrice) // desta maneira o java nao precisa fazer packing e unpacking o tempo
                .filter(price -> price > 3) // todo
                .sum();

        System.out.println(priceSumPerformance);
    }
}
