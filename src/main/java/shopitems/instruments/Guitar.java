package shopitems.instruments;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String material ,Type type ,String color, int noOfStrings, double sellingPrice, double buyingPrice){
        super(material, type, color, sellingPrice, buyingPrice);
        this.noOfStrings = noOfStrings;
    }

    public String play() {
        return "Reeeawww";
    }

    public double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }

}
