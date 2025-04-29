
package supershopmarket.Shop;


public class Vegetables extends Grocery {
    
    private double vPrice;
    
    
    

//    public Vegetables() {
//    }
//
//    public Vegetables(double vPrice) {
//        this.vPrice = vPrice;
//    }
//
//    public Vegetables(double vPrice, String productName, double productPrice, double productQuantity, int itemNo, double salePrice, double totalSalePrice) {
//        super(productName, productPrice, productQuantity, itemNo, salePrice, totalSalePrice);
//        this.vPrice = vPrice;
//    }
//
//    public double getvPrice() {
//        return vPrice;
//    }
//
//    public void setvPrice(double vPrice) {
//        this.vPrice = vPrice;
//    }
//
//    @Override
//    public double getSalePrice() {
//        
//        vPrice+=vPrice;
//        
//        return vPrice;
//    }

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

    public double getgPrice() {
        return gPrice;
    }
    
    public void setgPrice(double gPrice) {
        this.gPrice = gPrice;
    }

    public void setvPrice(double vPrice) {
        this.vPrice = vPrice;
    }

    @Override
    public double getSalePrice() {
         
         gPrice+=gPrice;
       
       return gPrice;
    }

    @Override
    public double getTotalPrice() {
         
        return getvPrice();
    }
    public double getTotalsalePrice(){
    double total=getTotalPrice()+getSalePrice();
    
    
    return total;
    }
  
    
    
}
