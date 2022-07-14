package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(5);

        mangas.add(new Manga(5L, "Shingeki no Kyojin", 24.5, 0));
        mangas.add(new Manga(2L, "Berserk", 21.1, 5));
        mangas.add(new Manga(3L, "Hellsing", 20.0, 0));
        mangas.add(new Manga(1L, "One Piece", 17.5, 2));
        mangas.add(new Manga(4L, "FullMetal", 12.9, 0));

        // Iterator<Manga> mangaIterator = mangas.iterator();
        // while (mangaIterator.hasNext()) {
        // Manga manga = mangaIterator.next();
        // if (manga.getQuantity() == 0) {
        // mangaIterator.remove();
        // System.out.println("Manga removido: " + manga.getName());
        // }
        // }
        // }

        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);
    }
}
