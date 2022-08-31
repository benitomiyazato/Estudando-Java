package academy.devdojo.maratonajava.javacore.Kenumeracao.domain;

public enum ClientType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int index;
    public final String name;

    ClientType(int index, String name){
        this.index = index;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static ClientType clientTypeByName(String name){
        for (ClientType type : values()) {
            if(type.getName().equals(name)){
                return type;
            }
        }
        return null;
    }
}
