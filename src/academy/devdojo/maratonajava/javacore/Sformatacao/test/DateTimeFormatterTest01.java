package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        ZonedDateTime now2 = ZonedDateTime.now();

        String f1 = now.format(DateTimeFormatter.BASIC_ISO_DATE); // 20220509
        String f2 = now.format(DateTimeFormatter.ISO_LOCAL_DATE); // 2022-05-09
        String f3 = now2.format(DateTimeFormatter.ISO_DATE); // 2022-05-09+01:00

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        LocalDate dateParse = LocalDate.parse("2022-05-09-03:00", DateTimeFormatter.ISO_DATE); // informar de qual
                                                                                               // DateTimeFormatter é
                                                                                               // (neste caso, ISO_DATE)
        System.out.println("date parseada = " + dateParse);

        DateTimeFormatter formatITALY = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ITALY);
        String brasilDate = now.format(formatITALY);
        System.out.println(brasilDate);

        LocalDate abc = LocalDate.parse("09/maggio/2022", formatITALY);
        System.out.println(abc);
    }
}