package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.ZoneId;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIDS = ZoneId.SHORT_IDS;
        System.out.println(shortIDS);
        System.out.println(ZoneId.of("Australia/Sydney"));
    }

}
