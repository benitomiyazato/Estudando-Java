package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursive();
    }

    public static void recursive(){
        recursive();
    }
}
