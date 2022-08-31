package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {
    
    public void sum(double... nums){
       double sum = 0;
       for (double d : nums) {
           sum += d;
       }
       System.out.printf("A soma de todos os números inseridos é igual a: %.1f", sum);
    }

    public void divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Insira um número válido");
        } else {
            System.out.println(num1/num2);
        }
    }

    public void changeTwoNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dento do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
