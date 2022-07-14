package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class TaxCalculator {

    public static void CalcTaxes(Product product) {
        if (product instanceof Computer) {
            Computer computer = (Computer) product;
            TaxCalculator.CalcTaxes(computer);
        }
        if (product instanceof Tomate) {
            Tomate tomate = (Tomate) product;
            TaxCalculator.CalcTaxes(tomate);
        }
    }

    private static void CalcTaxes(Computer computer) {
        System.out.println("Relatório de impostos deste computador:");
        System.out.printf("Produto: %s\n", computer.getName());
        double taxes = computer.calcTaxes();
        System.out.printf("Impostos: %.2f\n", taxes);
        System.out.printf("Valor total: %.2f\n", taxes + computer.getPrice());
        System.out.println("----------------------------");
    }

    private static void CalcTaxes(Tomate tomate) {
        System.out.println("Relatório de impostos deste Tomate:");
        System.out.printf("Produto: %s\n", tomate.getName());
        System.out.printf("Data de validade: %s\n", tomate.getExpirationDate());
        double taxes = tomate.calcTaxes();
        System.out.printf("Impostos: %.2f\n", taxes);
        System.out.printf("Valor total: %.2f\n", taxes + tomate.getPrice());
        System.out.println("----------------------------");
    }
}
