package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    // NAO CRIAR ATRIBUTOS NEM PARAMETROS COM OPTIONAL
    // NAO CRIAR ATRIBUTOS NEM PARAMETROS COM OPTIONAL
    // NAO CRIAR ATRIBUTOS NEM PARAMETROS COM OPTIONAL
    public static void main(String[] args) {
        Optional<String> optional = findName("asda123");
        String optionalTreated = optional.orElse("VAZIO NAO EXISTE ESSE NOME NESSA LISTA");
        System.out.println(optionalTreated);
        optional.ifPresent(s -> System.out.println(s.toUpperCase()));

    }

    private static Optional<String> findName(String name) {
        List<String> names = List.of("Baiano", "Linguine", "zoro", "luffy");
        int i = names.indexOf(name);
        if (i != -1) {
            return Optional.ofNullable(names.get(i));
        }
        return Optional.empty();
    }
}
