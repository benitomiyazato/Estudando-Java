package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String text = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.print("Encontro nº" + count + "\n");
            System.out.println("Início: " + matcher.start() + " Fim: " + matcher.end());
            System.out.println("---------------------------------------");
        }
    }
}
