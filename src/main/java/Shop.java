import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<ISell>();
    }

    public void addItemToStock(ISell product){
        stock.add(product);
    }

    public void removeItemToStock(ISell product){
        stock.remove(product);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double shopStockProfit(){
        double total = 0;
        for (ISell product : stock){
            double itemProfit = product.calculateMarkUp();
            total += itemProfit;
        }
        return total;
    }
}
