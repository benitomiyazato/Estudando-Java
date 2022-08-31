package academy.devdojo.maratonajava.javacore.Gassociacao.domain;
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.println("Name: " + this.name);
        if (players == null) {
            System.out.println("This team has no players");
            return;
        }
        // for iterates the ArrayList players and prints their names
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).getName());
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player... players) {
        for (int i = 0; i < players.length; i++) {
            this.players.add(players[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
