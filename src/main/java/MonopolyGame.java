import java.util.*;

public class MonopolyGame {

    private final int NB_ROUND = 20;
    private int roundCnt;

    private Vector<Player> players = new Vector<Player>();
    Die[] dies = {new Die(), new Die()};
    Board board;

    MonopolyGame() {
        board = new Board();
    }

    public void playGame(int nbPlayer)
    {
        for (int i = 0; i < nbPlayer; i++)
        {
            players.add(new Player("player" + (i + 1), this));
        }

        while (roundCnt < NB_ROUND) {
            playRound(nbPlayer);
            roundCnt++;
        }
    }

    private void playRound(int nbPlayer)
    {
        for (int i = 0; i < nbPlayer; i++)
        {
            players.elementAt(i).takeTurn();
        }
    }
}
