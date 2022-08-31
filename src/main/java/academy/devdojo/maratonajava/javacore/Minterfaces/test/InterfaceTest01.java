package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataRemover;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class InterfaceTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader01 = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        DataRemover.baiano();
        databaseLoader01.checkPermission();
        fileLoader.checkPermission();
    }
}
