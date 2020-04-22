public class Board {
    private final int BOARD_SIZE = 40;

    private Square[] squares = new Square[BOARD_SIZE];

    Board() {
        for (int i = 0; i < BOARD_SIZE; i++)
        {
            squares[i] = new Square();
        }
    }

    public Square getSquare(Square oldLoc, int fvTotal) {
        return squares[(oldLoc.getId() + fvTotal) % BOARD_SIZE];
    }

    public Square[] getSquares() {
        return squares;
    }
}
