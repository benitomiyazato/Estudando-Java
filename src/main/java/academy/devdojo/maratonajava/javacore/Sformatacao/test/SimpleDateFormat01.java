package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class SimpleDateFormat01 {
    public static void main(String[] args) {
        String template = "'Hoje é dia' dd 'do mês' mm 'do ano de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(template);
        System.out.println(sdf.format(Date.from(Instant.now())));

    }
}
