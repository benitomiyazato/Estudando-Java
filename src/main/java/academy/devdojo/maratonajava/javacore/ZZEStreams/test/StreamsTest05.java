package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;

public class StreamsTest05 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8)); // qualquer um > 8?
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // todos > 0?
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0)); // nenhum > 0?

        lightNovels.stream()
                .filter(ln -> ln.getPrice() < 4)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() < 4)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() < 4)
                .findAny()
                .ifPresent(System.out::println);
    }
}
