
package supershopmarket.Shop;


public class Shop {
    
    private String productName;
    private double productPrice;
    private double productQuantity;
    private int itemNo;
    private double salePrice;
    private double totalSalePrice;

    public Shop() {
    }

    public Shop(String productName, double productPrice, double productQuantity, int itemNo, double salePrice, double totalSalePrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.itemNo = itemNo;
        this.salePrice = salePrice;
        this.totalSalePrice = totalSalePrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getTotalSalePrice() {
        
       
        return totalSalePrice;
    }

    public void setTotalSalePrice(double totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
    }
    
    
    
}
