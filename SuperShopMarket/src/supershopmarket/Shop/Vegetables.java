package supershopmarket.Shop;

public class Vegetables extends Grocery {

    private double vPrice;

    public Vegetables() {
    }

    public Vegetables(double vPrice) {
        this.vPrice = vPrice;
    }

    public Vegetables(double vPrice, double gPrice) {
        super(gPrice);
        this.vPrice = vPrice;
    }

    public Vegetables(double vPrice, double gPrice, String productName, double productPrice, double productQuantity, int itemNo, double salePrice, double totalSalePrice) {
        super(gPrice, productName, productPrice, productQuantity, itemNo, salePrice, totalSalePrice);
        this.vPrice = vPrice;
    }

    public double getvPrice() {
        return vPrice;
    }

    public void setvPrice(double vPrice) {
        this.vPrice = vPrice;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = getgPrice() + vPrice;
        System.out.println(getgPrice() + "-------" + vPrice);
        if (totalPrice > 7000) {
            return totalPrice - (totalPrice * .10);
        } else {
            return totalPrice;
        }

    }

}
