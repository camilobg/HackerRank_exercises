package HackerRank;

import java.util.Comparator;
import java.util.List;
/*
Ordenar los objetos de una lista precio*cantidad, orden decresiente
 */

public class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        StockItem item = new StockItem("Jamón",100.5,5);
        System.out.println(item.getQuantity());
    }
}

class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        // your code here
        stockItems.sort((x,y)->{
            double total1=(double)x.getQuantity()*x.getPricePerUnit();
            double total2=(double)y.getQuantity()*y.getPricePerUnit();
            return Double.valueOf(total2).compareTo(total1);
        });
        return stockItems;
    }
}
