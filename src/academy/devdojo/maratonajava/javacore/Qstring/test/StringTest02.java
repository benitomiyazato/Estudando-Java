package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Luffy";
        String numbers = "123456789";
        String alo = "   Baian o  ";

        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(numbers.substring(2));
        System.out.println(numbers.substring(0, numbers.length()));
        System.out.println(alo);
        System.out.println(alo.trim());
    }
}
