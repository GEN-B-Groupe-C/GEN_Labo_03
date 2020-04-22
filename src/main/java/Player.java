public class Player {

    private final int BEGIN_CASH = 1500;
    private String name;
    MonopolyGame game;
    Piece piece;
    private int cash;
    Cup cup;

    Player(String name, MonopolyGame game)
    {
        this.name = name;
        this.game = game;
        piece = new Piece("piece " + "name", game);
        cash = BEGIN_CASH;
        cup = new Cup();
    }

    public void takeTurn()
    {
        int fvTot;
        cup.roll();
        fvTot = cup.getTotal();
        System.out.println(name + " lance les dés et obtient " + fvTot);

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
