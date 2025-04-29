
package supershopmarket.Shop;


public class Vegetables extends Shop {
    
    private double vPrice;

    public Vegetables() {
    }

    public Vegetables(double vPrice) {
        this.vPrice = vPrice;
    }

    public Vegetables(double vPrice, String productName, double productPrice, double productQuantity, int itemNo, double salePrice, double totalSalePrice) {
        super(productName, productPrice, productQuantity, itemNo, salePrice, totalSalePrice);
        this.vPrice = vPrice;
    }

    public double getvPrice() {
        return vPrice;
    }

    public void setvPrice(double vPrice) {
        this.vPrice = vPrice;
    }
    
    
    
}
