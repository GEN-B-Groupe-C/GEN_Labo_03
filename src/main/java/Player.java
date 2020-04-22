public class Player {

    private final int NB_ROLL = 2;
    private String name;
    MonopolyGame game;
    Piece piece;

    Player(String name, MonopolyGame game)
    {
        this.name = name;
        this.game = game;
        piece = new Piece("piece " + "name", game);
    }

    public void takeTurn()
    {
        int fvTot = 0;
        int temp;
        for (int i = 0; i < NB_ROLL; i++) {
            game.dies[i].roll();
            temp = game.dies[i].getFaceValue();
            System.out.println(name + " lance le dés et obtient " + temp);
            fvTot += temp;
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = game.board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
        System.out.println(name + " s'est déplacé sur " + newLoc);
    }
}
