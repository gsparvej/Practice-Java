
package onlineshoppingsystemusinginheritance2;

import onlineshoppingsystemusinginheritance2.shopping.Clothes;
import onlineshoppingsystemusinginheritance2.shopping.Electronics;
import onlineshoppingsystemusinginheritance2.shopping.Grocery;
import onlineshoppingsystemusinginheritance2.shopping.Product2;
import onlineshoppingsystemusinginheritance2.shopping.ServiceClass;


public class OnlineShoppingSystemUsingInheritance2 {

   
    public static void main(String[] args) {
        
        Clothes c=new Clothes();
        Electronics e=new Electronics();
        Grocery g=new Grocery();
        
        
        c.setClothesItem("Shirt");
        c.setClothSize("XL");
        c.setProductId("S-0011");
        c.setProductPrice(950);
        
        e.setElectroItem("Air Conditioner ");
        e.setProductId("A/C-9909");
        e.setWarranty("10 Years ");
        e.setProductPrice(60000);
        
        g.setGroceryItem("Fish,Beef,Vegetables ");
        g.setProductId("f-909,b-075,v-001");
        g.setProductPrice(1700);
        
        
        Product2[] items={c,e,g};
        ServiceClass myService=new ServiceClass(items);
        System.out.println("Details Your Products : ");
        
        myService.getDisplayInfo();
        System.out.println("Total : "+myService.calculateTotal());
    }
    
}
