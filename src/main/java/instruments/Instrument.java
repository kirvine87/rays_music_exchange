package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private Type type;
    private String colour;
    private double sellingPrice;
    private double buyingPrice;

    public Instrument(String material, Type type, String colour, double sellingPrice, double buyingPrice){
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public Type getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }




}
