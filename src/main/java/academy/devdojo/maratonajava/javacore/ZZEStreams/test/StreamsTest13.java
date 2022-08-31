package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;

public class StreamsTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE),
            new LightNovel("FullMetal Alchemist", 5.99, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Category, Long> categoryCountMap = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(categoryCountMap);

        Map<Category, LightNovel> categoryLightNovelMaxPrice = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(categoryLightNovelMaxPrice);

    }
}
