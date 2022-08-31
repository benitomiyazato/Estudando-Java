package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatStringBuilder(1000000);
        long fim = System.currentTimeMillis();
        System.out.printf("Tempo total gasto: %d ms", fim - start);
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 1; i <= size; i++) {
            sb.append(i);
        }
    }
}
