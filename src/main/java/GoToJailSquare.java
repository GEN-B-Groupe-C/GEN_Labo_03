public class GoToJailSquare extends Square {
    GoToJailSquare()
    {
        name = "Go to jail";
    }
    public void landedOn(Player p) {
        p.piece.setLocation(p.game.board.getSquares()[15]);
    }
}
