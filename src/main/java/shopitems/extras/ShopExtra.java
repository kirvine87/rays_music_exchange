package shopitems.extras;

import behaviours.ISell;

public abstract class ShopExtra implements ISell {

    private String description;
    private double sellingPrice;
    private double buyingPrice;

    public ShopExtra(String description, double sellingPrice, double buyingPrice){
        this.description = description;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }



}
