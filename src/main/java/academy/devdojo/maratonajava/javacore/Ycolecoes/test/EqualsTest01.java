package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1dban23", "Iphone");
        Smartphone s2 = new Smartphone("1dban24", "Iphone");

        boolean baiano = s1.equals(s2);
        System.out.println(baiano);
    }

}
