package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;

public class StreamsTest03 {
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
        Stream<LightNovel> lightNovelStream = lightNovels.stream();

        long priceLessThanFour = lightNovelStream.filter(ln -> ln.getPrice() <= 4).count();
        long priceLessThanFourDistinct = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println("Not distinct " + priceLessThanFour);
        System.out.println("Disctint " + priceLessThanFourDistinct);

    }
}
