

package onlineshoppingsystemusinginheritance.product;



public class Product {
 
    private String productName;
    private int productPrice;
    private String productId;

    public Product() {
    }

    public Product(String productName, int productPrice, String productId) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    
}
