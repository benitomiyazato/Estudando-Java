package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Person {
    private String name;
    private String cpf;
    private Adress adress;

    public Person(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.printf("\nName: %s\n", this.name);
        System.out.printf("CPF: %s\n", this.cpf);
        System.out.printf("Adress: %s\n", this.adress.getStreet());
        System.out.printf("CEP: %s\n", this.adress.getCep());
    }

    public String getCpf() {
        return cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

}
