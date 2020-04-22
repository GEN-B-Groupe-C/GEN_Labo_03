import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    Board board = new Board();

    @Test
    void squaresHasName()
    {
        for (Square s : board.getSquares())
        {
             assertNotNull(s.name);
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {17, 18, 19, 24})
    void getSquareTest(int value)
    {
        assertEquals(board.getSquares()[value] ,board.getSquare(board.getSquares()[value-2],2));
    }
}