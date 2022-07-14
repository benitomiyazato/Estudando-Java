package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player01 = new Player("A");
        Player player02 = new Player("B");
        Player player03 = new Player("C");
        Player[] players = {player01, player02, player03};
        
        players[0].printData();
    }
}
