
package onlineshoppingsystemusinginheritance2.shopping;


public class ServiceClass extends Product2{
    Product2[] product;

    public ServiceClass() {
    }

    public ServiceClass(Product2[] product) {
        this.product = product;
    }

//    public ServiceClass(Product2[] product, int productPrice, String productId) {
//        super(productPrice, productId);
//        this.product = product;
//    }
    
    public String calculateTotal(){
    double total=0;
    for(int i=0;i<product.length;i++){
    
        total+=product[i].getProductPrice();
    
    
    }
    
    return "Total : "+total;
    }
    
    public void getDisplayInfo(){
    for(Product2 p:product){
    
        System.out.println("--------------------------");
        System.out.println(" "+p.getDetails());
    }
    
    
    }
}
