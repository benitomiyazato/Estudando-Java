package academy.devdojo.maratonajava.javacore.ZZAinnerclasses.test;

public class OuterClassTest02 {
    private String name = "Zoro";

    // Classes locais são aquelas criadas dentro do corpo de um método/bloco d inic.
    public void print() {
        // atributos e parametros devem ser FINAL ou efetivamente FINAL
        String lastName = "Roronoa";

        // modificadores de acesso ABSTRACT ou FINAL
        class LocalClass {
            public void printLocal() {
                System.out.println("Meu nome: " + name + " " + lastName);
            }
        }
        LocalClass local = new LocalClass();
        local.printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outerClass = new OuterClassTest02();
        outerClass.print();
    }
}
