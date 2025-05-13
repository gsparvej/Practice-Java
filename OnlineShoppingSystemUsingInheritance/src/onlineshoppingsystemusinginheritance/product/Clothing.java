

package onlineshoppingsystemusinginheritance.product;



public class Clothing extends Product{
    
    private String clothSize;

    public Clothing() {
    }

    public Clothing(String clothSize) {
        this.clothSize = clothSize;
    }

    public Clothing(String clothSize, String productName, int productPrice, String productId) {
        super(productName, productPrice, productId);
        this.clothSize = clothSize;
    }

    public String getClothSize() {
        return clothSize;
    }

    public void setClothSize(String clothSize) {
        this.clothSize = clothSize;
    }

    @Override
    public String getDetails() {
        
        return super.getDetails()+"\nSize : "+clothSize; 
    }
    
    
}
