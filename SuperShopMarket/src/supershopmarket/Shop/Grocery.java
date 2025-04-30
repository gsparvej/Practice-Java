package supershopmarket.Shop;

public class Grocery extends Shop {

    private double gPrice;

    public Grocery() {
    }

    public Grocery(double gPrice) {
        this.gPrice = gPrice;
    }

    public Grocery(double gPrice, String productName, double productPrice, double productQuantity, int itemNo, double salePrice, double totalSalePrice) {
        super(productName, productPrice, productQuantity, itemNo, salePrice, totalSalePrice);
        this.gPrice = gPrice;
    }

    public double getgPrice() {
        return gPrice;
    }

    public void setgPrice(double gPrice) {
        this.gPrice = gPrice;
    }


    
    
    
    @Override
    public double calculateTotalPrice() {
        return gPrice;

    }

}
