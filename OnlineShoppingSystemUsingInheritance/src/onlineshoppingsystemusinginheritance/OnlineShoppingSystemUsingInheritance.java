
package onlineshoppingsystemusinginheritance;

import onlineshoppingsystemusinginheritance.product.Cart;
import onlineshoppingsystemusinginheritance.product.Clothing;
import onlineshoppingsystemusinginheritance.product.Electronics;

import onlineshoppingsystemusinginheritance.product.Product;


public class OnlineShoppingSystemUsingInheritance {

    public static void main(String[] args) {
        

           Clothing c=new Clothing();
           Electronics e=new Electronics();
           
           c.setClothSize("XL");
           c.setProductName("Shirt");
           c.setProductId("S-001");
           c.setProductPrice(900);
           
           e.setProductName("Air Conditioner");
           e.setProductPrice(55000);
           e.setProductId("AC-9709");
           e.setWarranty("10 Years");

           Product[] items = {c,e};
        Cart myCart = new Cart(items);
        
        myCart.displayDetails();
        System.out.println("-----------------");
        System.out.println(myCart.calculateTotal());
      
    }
    
}
