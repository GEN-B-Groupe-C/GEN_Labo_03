public class Player {

    private final int NB_ROLL = 2, BEGIN_CASH = 1500;
    private String name;
    MonopolyGame game;
    Piece piece;
    private int cash;

    Player(String name, MonopolyGame game)
    {
        this.name = name;
        this.game = game;
        piece = new Piece("piece " + "name", game);
        cash = BEGIN_CASH;
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

        newLoc.landedOn(this);
    }

    public void addCash(int number) {
        cash += number;
    }

    public int getNetWorth() {
        return cash;
    }

    public void reduceCash(int number) {
        cash -= number;
    }
}
