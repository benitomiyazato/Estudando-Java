package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Reader1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Reader2;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readArchive();
    }

    private static void readArchive() {
        try (Reader1 reader1 = new Reader1();
                Reader2 reader2 = new Reader2()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}