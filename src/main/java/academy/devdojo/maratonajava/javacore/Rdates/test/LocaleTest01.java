package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR"); // language = ISO639 country = ISO3166
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSW = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Calendar c = Calendar.getInstance();

        DateFormat dateFormat1 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeBrazil);
        DateFormat dateFormat2 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeItaly);
        DateFormat dateFormat3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeSW);
        DateFormat dateFormat4 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeIndia);
        DateFormat dateFormat5 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, localeJapan);
        
        System.out.println(dateFormat1.format(c.getTime()));
        System.out.println(dateFormat2.format(c.getTime()));
        System.out.println(dateFormat3.format(c.getTime()));
        System.out.println(dateFormat4.format(c.getTime()));
        System.out.println(dateFormat5.format(c.getTime()));

        System.out.println(localeBrazil.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeJapan.getDisplayCountry());



    }
}
