package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        for (int[] is : numeros) {
            for (int num : is) {
                System.out.println(num);
            }
        }
    }
}
