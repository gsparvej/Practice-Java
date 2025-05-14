
package onlineshoppingsystemusinginheritance2.shopping;


public class Product2 {
    private int productPrice;
    private String productId;

    public Product2() {
    }

    public Product2(int productPrice, String productId) {
        this.productPrice = productPrice;
        this.productId = productId;
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
    
    public String getDetails(){
    
    
    return "Product Price : "+productPrice+
            "\nProduct Id : "+productId;
    }
}
