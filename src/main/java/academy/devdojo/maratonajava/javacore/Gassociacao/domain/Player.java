package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Player {
    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println(this.name);
        if(team == null){
            System.out.println("This player does not have a Team yet");
            return;
        }
        System.out.println(this.team.getName());
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
