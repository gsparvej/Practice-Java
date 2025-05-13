
package onlineshoppingsystemusinginheritance.product;


public class Cart extends Product{
    
    Product[] products;

    public Cart() {
    }

    public Cart(Product[] products) {
        this.products = products;
    }
    
    
    public double calculateTotal(){
    double total=0;
    for(int i=0;i<products.length;i++){
    
        total+=products[i].getProductPrice();
   
    }
    return total;
    }
    
    
    public void displayDetails(){
    
    for(Product p:products){
        System.out.println("Your Products Details : ");
        System.out.println("---------------");
        System.out.println(""+p.getDetails());
    
    }
    
    }
}
