package shopitems.extras;

public class Sheetmusic extends ShopExtra {


    public Sheetmusic(String description, double sellingPrice, double buyingPrice) {
        super(description, sellingPrice, buyingPrice);
    }

    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }

}
