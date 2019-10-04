package shopitems.extras;

public class GuitarStrings extends ShopExtra {

    public GuitarStrings(String description, double sellingPrice, double buyingPrice) {
        super(description, sellingPrice, buyingPrice);
    }


    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }

}
