import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    Piece piece = new Piece("test1", new MonopolyGame());

    @Test
    void deplacementTest(){
        Square init = piece.getLocation();
        piece.setLocation(new RegularSquare());
        assertNotEquals(init, piece.getLocation());
    }
}