package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() {
        saxophone = new Saxophone("Copper", Type.BRASS, "Copper", 25, 200.00, 152.00);
    }

    @Test
    public void play() {
        assertEquals("Brrrrr", saxophone.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(48.00, saxophone.calculateMarkUp(), 0.01);
    }
    
}