import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board;

    @BeforeEach
    void init()
    {
        board = new Board();
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 12, 14, 24})
    void getSquareTest(int value)
    {
        assertEquals(board.getSquares()[value] ,board.getSquare(board.getSquares()[value-2],2));
    }
}