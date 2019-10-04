package instruments;

public class Saxophone extends Instrument{

    private int noOfValves;

    public Saxophone(String material, Type type, String colour, int noOfValves, double sellingPrice, double buyingPrice) {
        super(material, type, colour, sellingPrice, buyingPrice);
        this.noOfValves = noOfValves;
    }

    public String play() {
        return "Brrrrr";
    }

    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }

}
