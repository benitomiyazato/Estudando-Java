package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(999999999999999999L); //long com milissegundos desde 1970
        System.out.println(date);
    }
}