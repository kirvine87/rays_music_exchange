package shopitems.extras;

import org.junit.Before;
import org.junit.Test;
import shopitems.instruments.Guitar;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Strings from Jimmy Hendrix's guitar", 5000.00, 0.00);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(0.00, guitarStrings.getBuyingPrice(), 0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(5000.00, guitarStrings.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(5000.00, guitarStrings.calculateMarkUp(), 0.01);
    }
}