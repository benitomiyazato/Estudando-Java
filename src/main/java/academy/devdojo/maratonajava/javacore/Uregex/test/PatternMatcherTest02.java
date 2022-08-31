package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não é dígito --> letras, caracteres especiais, etc.
        // \s = espaços em branco
        // \S = espaços preenchidos (tudo que nao ta em branco)
        // \w = a-z, A-Z, dígitos, _ 
        // \W = tudo oq não está presente em \w
        String regex = "\\w";
        String text = "8@_ruji 9fo7gh te40y5Z 6";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.print("Encontro nº" + count + "\n");
            System.out.println("Início: " + matcher.start() + " Fim: " + matcher.end() + " Conteúdo encontrado: "
                    + matcher.group());
            System.out.println("---------------------------------------");
        }
    }
}
