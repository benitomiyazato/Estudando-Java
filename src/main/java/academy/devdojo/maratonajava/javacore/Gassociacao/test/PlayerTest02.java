package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player01 = new Player("Baiano");
        Team team01 = new Team("Curinca");
        player01.printData();
        player01.setTeam(team01);
        player01.printData();

    }
}
