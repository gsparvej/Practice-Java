
package onlineshoppingsystemusinginheritance.product;


public class Cart extends Product{
    
    Product[] products;

    public Cart() {
    }

    public Cart(Product[] products) {
        this.products = products;
    }
    
    
    public String calculateTotal(){
    double total=0;
    double bonus=0;
    for(int i=0;i<products.length;i++){
    
        total+=products[i].getProductPrice();
   
    }
    
    if(total>50000){
    
         bonus=total-total*0.15;
    
    }
    return "Your Total Price Is : "+total+"\nAfter 15% Discount You Must Pay : "+bonus;
    }
    
    
    public void displayDetails(){
    
    for(Product p:products){
        System.out.println("Your Products Details : ");
        System.out.println("---------------");
        System.out.println(""+p.getDetails());
    
    }
    
    }
}
