package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Team team01 = new Team("Corinthians");
        Player player01 = new Player("Baiano");
        Player player02 = new Player("Linguine");

        player01.setTeam(team01);
        team01.setPlayers(player01, player02);
        team01.printData();

    }
}
