package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;
        Locale localeGM = Locale.GERMANY;

        NumberFormat[] numberFormatArray = new NumberFormat[4];
        numberFormatArray[0] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormatArray[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormatArray[2] = NumberFormat.getCurrencyInstance(localeUS);
        numberFormatArray[3] = NumberFormat.getCurrencyInstance(localeGM);

        double value = 100_000_000.000;

        for (NumberFormat numberFormat : numberFormatArray) {
            System.out.println(numberFormat.format(value));
        }

    }
}