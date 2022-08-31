package academy.devdojo.maratonajava.javacore.Npolimorfismo.repository;

public class DataBaseRepository implements Repository{

    @Override
    public void save(){
        System.out.println("Salvando Data Base Repository");
    }
}
