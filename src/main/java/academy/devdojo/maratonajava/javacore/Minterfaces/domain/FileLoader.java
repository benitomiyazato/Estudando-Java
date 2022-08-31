package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    
    @Override
    public void load() {
        System.out.println("Loading Files");
    }

    @Override
    public void remove(){
        System.out.println("Removing from database");
    }
}
