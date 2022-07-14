package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não é dígito --> letras, caracteres especiais, etc.
        // \s = espaços em branco
        // \S = espaços preenchidos (tudo que nao ta em branco)
        // \w = a-z, A-Z, dígitos, _
        // \W = tudo oq não está presente em \w
        // [] = In range
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = Uma ou mais
        // {n, m} = de n a m
        // () = agrupamento
        // | = ou --> ex.: o(v|c)o = ovo/oco
        // $ = fim da linha
        // . --> ex.: 1.3 = caractere coringa, qualquer coisa que puder estar entre o um e o três, ex.: 123 113 1#3 133...
        // ^ = negação --> ex.: ^\w = tudo que não pertence ao \w
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x109";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            System.out.print("Encontro nº" + count + "\n");
            System.out.println("Início: " + matcher.start() + " Fim: " + matcher.end() + " Conteúdo encontrado: "
                    + matcher.group());
            System.out.println("---------------------------------------");
            count++;
        }

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String nformatted = nf1.format(107778234);
        System.out.println(nformatted);
    }
}
