package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Wood", Type.STRING, "Black", 5,300.50, 123.90);
    }

    @Test
    public void canPlay() {
        assertEquals("Reeeawww", guitar.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(176.60, guitar.calculateMarkUp(), 0.01);
    }

}