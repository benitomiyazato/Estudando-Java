package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataRemover {
    void remove();

    default void checkPermission(){
        System.out.println("Checking Permission");
    }

    public static void baiano(){
        System.out.println("BAIANOOOOOOOOOOOOOOOOOO");
    }
}
