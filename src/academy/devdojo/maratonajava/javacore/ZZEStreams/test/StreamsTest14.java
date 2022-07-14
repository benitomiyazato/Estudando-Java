package academy.devdojo.maratonajava.javacore.ZZEStreams.test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEStreams.domain.Promotion;

public class StreamsTest14 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);

        /* ----=--=-==-=-=-=-=-=== */

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE,
                                Collectors.toSet())));

        System.out.println(collect2);

        Map<Category, Set<Promotion>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE,
                                Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect3);

    }
}
