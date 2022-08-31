package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumer;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

class ConsumerIdComparator implements Comparator<Consumer> {

    @Override
    public int compare(Consumer o1, Consumer o2) {
        return Long.compare(o1.getId(), o2.getId());
    }

}

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumer consumer3 = new Consumer("Linguine");
        Consumer consumer1 = new Consumer("Baiano");
        Consumer consumer2 = new Consumer("Cassiano");

        Manga manga1 = new Manga(5L, "Shingeki no Kyojin", 24.5);
        Manga manga2 = new Manga(2L, "Berserk", 21.1);
        Manga manga3 = new Manga(3L, "Hellsing", 20.0);
        Manga manga4 = new Manga(1L, "One Piece", 17.5);
        Manga manga5 = new Manga(4L, "FullMetal", 12.9);

        List<Manga> consumer1MangaList = List.of(manga1, manga2, manga3);
        List<Manga> consumer2MangaList = List.of(manga4, manga5);
        List<Manga> consumer3MangaList = List.of(manga3);

        // A chave precisa implementar a interface Comparable
        // entao os maps sao organizados através da chave
        NavigableMap<Consumer, List<Manga>> map = new TreeMap<>();
        map.put(consumer1, consumer1MangaList);
        map.put(consumer2, consumer2MangaList);
        map.put(consumer3, consumer3MangaList);

        for (Map.Entry<Consumer, List<Manga>> entry : map.entrySet()) {
            System.out.println("\n" + entry.getKey().getName() + " ID:" + entry.getKey().getId() + " comprou:");
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getName());
            }
        }
        System.out.println(map.floorKey(consumer2).getName());
    }
}
