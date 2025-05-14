
package onlineshoppingsystemusinginheritance2.shopping;


public class Electronics extends Product2{
    private String electroItem;
    private String warranty;

    public Electronics() {
    }

    public Electronics(String electroItem, String warranty) {
        this.electroItem = electroItem;
        this.warranty = warranty;
    }

    public Electronics(String electroItem, String warranty, int productPrice, String productId) {
        super(productPrice, productId);
        this.electroItem = electroItem;
        this.warranty = warranty;
    }

    public String getElectroItem() {
        return electroItem;
    }

    public void setElectroItem(String electroItem) {
        this.electroItem = electroItem;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public String getDetails() {
        return "Electronics Item : "+electroItem+"\nWarranty : "+warranty+
                "\n"+super.getDetails(); 
    }
    
    
}
