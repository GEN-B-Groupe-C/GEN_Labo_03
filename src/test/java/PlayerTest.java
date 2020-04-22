import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player p = new Player("playerTest", new MonopolyGame());

    @Test
    void testCash()
    {
        assertEquals(1500,p.getNetWorth());
        p.addCash(500);
        assertEquals(2000, p.getNetWorth());
        p.reduceCash(200);
        assertEquals(1800, p.getNetWorth());
    }
}