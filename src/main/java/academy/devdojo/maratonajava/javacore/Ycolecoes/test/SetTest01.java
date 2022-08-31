package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashSet;
import java.util.Set;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

public class SetTest01 {
    public static void main(String[] args) {
        // Sets não tem ordem nem index
        // LinkedHashSet mantem a ordem de inserção
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5L, "Shingeki no Kyojin", 24.5, 0));
        mangas.add(new Manga(2L, "Berserk", 21.1, 5));
        mangas.add(new Manga(3L, "Hellsing", 20.0, 0));
        mangas.add(new Manga(1L, "One Piece", 17.5, 2));
        mangas.add(new Manga(4L, "FullMetal", 12.9, 0));
        mangas.add(new Manga(4L, "FullMetal", 12.9, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
