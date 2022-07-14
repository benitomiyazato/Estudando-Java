package academy.devdojo.maratonajava.javacore.Csobrecargametodos.domain;

public class Anime {
    private String name;
    private String type;
    private String gender;
    private int episode;

    public Anime(String name, String type, int episode, String gender) {
        this.name = name;
        this.type = type;
        this.episode = episode;
        this.gender = gender;
    }

    public void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Episode: " + this.episode);
        System.out.println("Gender: " + this.gender);
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getepisode() {
        return episode;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

}
