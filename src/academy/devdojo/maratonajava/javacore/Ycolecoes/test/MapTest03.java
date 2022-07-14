package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumer;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class MapTest03 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Baiano");
        Consumer consumer2 = new Consumer("Linguine");

        Manga manga1 = new Manga(5L, "Shingeki no Kyojin", 24.5);
        Manga manga2 = new Manga(2L, "Berserk", 21.1);
        Manga manga3 = new Manga(3L, "Hellsing", 20.0);
        Manga manga4 = new Manga(1L, "One Piece", 17.5);
        Manga manga5 = new Manga(4L, "FullMetal", 12.9);

        List<Manga> consumer1MangaList = List.of(manga1, manga2, manga3);
        List<Manga> consumer2MangaList = List.of(manga4, manga5);

        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, consumer1MangaList);
        consumerMangaMap.put(consumer2, consumer2MangaList);

        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()) {
            System.out.println("\n" + entry.getKey().getName() + " comprou:");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getName());
            }
        }

    }
}
