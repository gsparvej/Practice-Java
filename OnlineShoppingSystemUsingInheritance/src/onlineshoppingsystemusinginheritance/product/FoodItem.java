
package onlineshoppingsystemusinginheritance.product;

import java.util.Date;


public class FoodItem extends Product{
   
    private Date expirydate;

    public FoodItem() {
    }

    public FoodItem(Date expirydate) {
        this.expirydate = expirydate;
    }

    public FoodItem(Date expirydate, String productName, int productPrice, String productId) {
        super(productName, productPrice, productId);
        this.expirydate = expirydate;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    @Override
    public String getDetails() {
        
        return super.getDetails()+"\nExpiry Date : "+expirydate; 
    }
    
    
}
