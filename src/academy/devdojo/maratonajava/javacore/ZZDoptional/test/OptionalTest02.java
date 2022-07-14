package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.Optional;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> manga1 = MangaRepository.findMangaByTitle("One Piece");
        manga1.ifPresent(manga -> manga.setTitle("VAI TOMAR NO CU"));
        System.out.println(manga1);

        Manga manga2 = MangaRepository.findMangaById(1).orElseThrow(IllegalArgumentException::new);
        System.out.println(manga2);

        Manga newManga = MangaRepository.findMangaByTitle("Dragon Ball Z")
                .orElseGet(() -> new Manga(3, "Dragon Ball Z", 123));
                
        System.out.println(newManga);

    }
}
