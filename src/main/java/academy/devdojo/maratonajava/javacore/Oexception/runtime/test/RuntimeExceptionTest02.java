package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divide(1, 0));
    }

    /**
     * 
     * @param a dividendo
     * @param b divisor, não pode ser 0
     * @throws IllegalArgumentException se b for 0
     * @return divisão entre a e b
     */
    private static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser igual a 0");
        }
        return a / b;
    }
}
