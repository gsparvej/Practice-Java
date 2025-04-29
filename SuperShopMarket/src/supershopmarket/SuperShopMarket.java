
package supershopmarket;

import supershopmarket.Shop.Grocery;
import supershopmarket.Shop.Vegetables;


public class SuperShopMarket {

    
    public static void main(String[] args) {
        
        Grocery g=new Grocery();
        Vegetables v =new Vegetables();
        
        g.setgPrice(200+500+1500+200+1500);
        v.setvPrice(200+200+500);
        
        System.out.println("Grocery Total Price : "+g.getSalePrice());
        System.out.println("Vegetables Total Price : "+v.getSalePrice());
        
        System.out.println(""+g.getTotalPrice());
        System.out.println("---------------");
        System.out.println(""+v.getTotalsalePrice());
    }
    
}
