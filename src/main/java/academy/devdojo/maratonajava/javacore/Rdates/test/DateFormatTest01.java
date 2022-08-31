package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[8];
        int count = 1;

        df[0] = DateFormat.getInstance(); // 04/05/2022 15:37
        df[1] = DateFormat.getDateInstance(); // 4 de mai. de 2022
        df[2] = DateFormat.getDateTimeInstance(); // 4 de mai. de 2022 15:37:51
        df[3] = DateFormat.getTimeInstance(); // 15:37:51
        df[4] = DateFormat.getDateInstance(DateFormat.SHORT); // 04/05/2022
        df[5] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 4 de mai. de 2022
        df[6] = DateFormat.getDateInstance(DateFormat.LONG); // 4 de maio de 2022
        df[7] = DateFormat.getDateInstance(DateFormat.FULL); // quarta-feira, 4 de maio de 2022

        for (DateFormat dateFormat : df) {
            System.out.print("Linha " + count + ":");
            count++;
            System.out.println(" " + dateFormat.format(calendar.getTime()));
        }

    }
}
