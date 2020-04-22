import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Vector;

public class RegularSquareTest {
    Vector<RegularSquare> s = new Vector<RegularSquare>();

    @BeforeEach
    void init()
    {
        for (int i = 0; i < 20; i++)
        {
            s.add(new RegularSquare());
        }
    }

    @Test
    void checkName() {
        for (RegularSquare re : s)
        {
            assertAll(
                    () -> assertNotNull(re.name),
                    () -> assertTrue(re.name.startsWith("Square"))
            );
        }
    }
}
