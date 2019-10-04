import org.junit.Before;
import org.junit.Test;
import shopitems.extras.GuitarStrings;
import shopitems.extras.Sheetmusic;
import shopitems.instruments.Guitar;
import shopitems.instruments.Type;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        shop = new Shop();
        guitar = new Guitar("Wood", Type.STRING, "Black", 5,300.50, 123.90);
        guitarStrings = new GuitarStrings("Strings from Jimmy Hendrix's guitar", 5000.00, 0.00);
    }

    @Test
    public void addItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void removeItemToStock() {
        shop.addItemToStock(guitar);
        shop.removeItemToStock(guitarStrings);
        assertEquals(1, shop.getStock().size());
    }
}