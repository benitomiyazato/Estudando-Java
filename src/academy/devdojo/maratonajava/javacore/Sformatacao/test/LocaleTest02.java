package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] countries = Locale.getISOCountries();
        String[] languages = Locale.getISOLanguages();

        for (String count : countries) {
            System.out.print(count + " ");
        }

        System.out.println("\n-------------------------------------------------------------------------------------------");
        for (String lang : languages) {
            System.out.print(lang + " ");
        }
    }
}
