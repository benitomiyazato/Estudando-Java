package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int numeroFinal=0;
        for(int num: numeros){
            System.out.println(num);
            if(num == numeros[3]){
                numeroFinal = num;
            }
        }
        System.out.println(numeroFinal);
    }
}
