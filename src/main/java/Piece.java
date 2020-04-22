public class Piece {
    private String name;

    private Square isOn;

    Piece (String name, MonopolyGame game) {
        this.name = name;
        isOn = game.board.getSquares()[0];
    }

    public Square getLocation() {
        return isOn;
    }

    public void setLocation(Square newLoc) {
        isOn = newLoc;
    }
}
