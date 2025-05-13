

package onlineshoppingsystemusinginheritance.product;



public class Electronics extends Product{
    
    private String warranty;

    public Electronics() {
    }

    public Electronics(String warranty) {
        this.warranty = warranty;
    }

    public Electronics(String warranty, String productName, int productPrice, String productId) {
        super(productName, productPrice, productId);
        this.warranty = warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public String getDetails() {
        
        return super.getDetails()+"\nWarranty : "+warranty; 
    }
    
    
}
