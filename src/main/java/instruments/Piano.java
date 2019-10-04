package instruments;

public class Piano extends Instrument{

    private int noOfKeys;

    public Piano(String material, Type type, String colour, int noOfKeys, double sellingPrice, double buyingPrice) {
        super(material, type, colour, sellingPrice, buyingPrice);
        this.noOfKeys = noOfKeys;
    }

    public String play() {
        return "tinkle tinkle";
    }


    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }

}
