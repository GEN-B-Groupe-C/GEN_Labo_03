public class Board {
    private final int BOARD_SIZE = 40;

    private Square[] squares = new Square[BOARD_SIZE];

    Board() {
        for (int i = 0; i < BOARD_SIZE; i++)
        {
            if (i == 0)
            {
                squares[i] = new GoSquare();
            } else if (i == 10) {
                squares[i] = new GoToJailSquare();
            } else if (i == 20) {
                squares[i] = new IncomeTaxSquare();
            } else {
                squares[i] = new RegularSquare();
            }
        }
    }

    public Square getSquare(Square oldLoc, int fvTotal) {
        return squares[(oldLoc.getId() + fvTotal) % BOARD_SIZE];
    }

    public Square[] getSquares() {
        return squares;
    }
}
