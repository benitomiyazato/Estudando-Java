package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        Integer intWrapper = 10; // boxing
        int intPrimitive = 1;
        long l;

        intPrimitive = intWrapper; // unboxing
        l = intWrapper.longValue();
        System.out.println(intPrimitive);
        System.out.println(l);
        Character.isDigit('b');
    }
}
