import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    private final int DIE_HIGH = 6, DIE_LOW = 1;

    Die die = new Die();

    @BeforeEach
    void roll() {
        die.roll();
    }

    @RepeatedTest(10)
    void checkRoll()
    {
        System.out.println("Face : " + die.getFaceValue());
        assertTrue(DIE_HIGH >= die.getFaceValue());
        assertFalse(DIE_LOW > die.getFaceValue());
    }
}