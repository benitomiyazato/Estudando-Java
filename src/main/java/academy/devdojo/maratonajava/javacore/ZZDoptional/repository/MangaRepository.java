package academy.devdojo.maratonajava.javacore.ZZDoptional.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

public class MangaRepository {
    private static List<Manga> mangaList = List.of(new Manga(1, "Boku no Hero", 54), new Manga(2, "One Piece", 1013));

    private static Optional<Manga> findManga(Predicate<Manga> predicate) {
        Manga foundManga = null;
        for (Manga manga : mangaList) {
            if (predicate.test(manga)) {
                foundManga = manga;
            }
        }
        return Optional.ofNullable(foundManga);
    }

    public static Optional<Manga> findMangaByTitle(String title) {
        return findManga(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> findMangaById(Integer id) {
        return findManga(manga -> manga.getId().equals(id));
    }

}
