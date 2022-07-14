package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExpectionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        try {
            int[] n = new int[3];
            n[3] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("vc nao pode colocar um número em um index maior que o tamanho do array");
            System.out.println("esse array tem tamanho 3, entao só vai até o indice 2");
        }

    }
}
