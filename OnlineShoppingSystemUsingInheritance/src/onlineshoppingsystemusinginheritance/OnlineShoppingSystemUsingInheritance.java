
package onlineshoppingsystemusinginheritance;

import onlineshoppingsystemusinginheritance.product.Cart;
import onlineshoppingsystemusinginheritance.product.Clothing;
import onlineshoppingsystemusinginheritance.product.Electronics;

import onlineshoppingsystemusinginheritance.product.Product;


public class OnlineShoppingSystemUsingInheritance {

    public static void main(String[] args) {
        
        Product p1=new Clothing();
        Product p2=new Electronics();
      //  Product p3=new FoodItem( "Chocolates", 1200, "co090");
      
      p1.setProductName("Shirt");
      p1.setProductPrice(900);
      p1.setProductId("s-0012");
      
      p2.setProductName("AirConditioner");
      p2.setProductPrice(55000);
      p2.setProductId("AC\00123");
      
      
        Product[] items = { p1, p2};
        Cart myCart = new Cart(items);
        
        myCart.displayDetails();
        System.out.println("-----------------");
        System.out.println("Total Price : "+myCart.calculateTotal());
      
    }
    
}
