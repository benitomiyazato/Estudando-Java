package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumer;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Baiano");
        Consumer consumer2 = new Consumer("Linguine");

        Manga manga1 = new Manga(5L, "Shingeki no Kyojin", 24.5);
        Manga manga2 = new Manga(2L, "Berserk", 21.1);
        Manga manga3 = new Manga(3L, "Hellsing", 20.0);
        Manga manga4 = new Manga(1L, "One Piece", 17.5);
        Manga manga5 = new Manga(4L, "FullMetal", 12.9);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga4);
        consumerMangaMap.put(consumer2, manga2);

        for (Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " comprou " + entry.getValue().getName());
        }
    }
}
