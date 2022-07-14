package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Baiano"; // String constant pool
        String nome2 = "Baiano";

        boolean equality = nome1 == nome2; // estão fazendo referencia ao mesmo endereço de memória
        System.out.println(equality);

        String nome3 = new String("Baiano"); // cria um novo objeto na memória, por isso nao compartilha o mesmo endereço das outras Strings dentro da pool
        equality = nome3 == nome2;
        System.out.println(equality);
    }
}
