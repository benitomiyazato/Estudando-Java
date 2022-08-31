package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

class MangaPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }

}

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());

        mangas.add(new Manga(5L, "Shingeki no Kyojin", 24.5, 0));
        mangas.add(new Manga(2L, "Berserk", 21.1, 5));
        mangas.add(new Manga(3L, "Hellsing", 20.0, 0));
        mangas.add(new Manga(1L, "One Piece", 17.5, 2));
        mangas.add(new Manga(4L, "FullMetal", 12.9, 0));
        mangas.add(new Manga(6L, "FullMetal BrotherHood", 12.9, 0));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
