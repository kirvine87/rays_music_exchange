package shopitems.extras;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetmusicTest {

    Sheetmusic sheetmusic;

    @Before
    public void setUp() {
        sheetmusic = new Sheetmusic("Music from the late Rock period", 50.00, 5.00);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(5.00, sheetmusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(50.00, sheetmusic.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(45.00, sheetmusic.calculateMarkUp(), 0.01);
    }
}