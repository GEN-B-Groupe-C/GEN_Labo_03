import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

    @Test
    void squaresHasName()
    {
        for (Square s : board.getSquares())
        {
             assertNotNull(s.name);
        }
    }
}