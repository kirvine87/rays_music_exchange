package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Oak", Type.KEYBOARD, "Bronw", 88, 2000.00, 1000.00);
    }

    @Test
    public void play() {
        assertEquals("tinkle tinkle", piano.play());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(1000.00, piano.calculateMarkUp(), 0.01);
    }

}