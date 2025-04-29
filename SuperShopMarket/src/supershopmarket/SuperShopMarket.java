
package supershopmarket;

import supershopmarket.Shop.Grocery;
import supershopmarket.Shop.Vegetables;


public class SuperShopMarket {

    
    public static void main(String[] args) {
        
        Grocery g=new Grocery();
        Vegetables v =new Vegetables();
        
        g.setgPrice(200+500+1500+200+1500);
        v.setvPrice(200+200+500);
        
        System.out.println(""+g.getSalePrice());
        System.out.println(""+v.getSalePrice());
        
        double gro=g.getSalePrice();
        double veg=v.getSalePrice();
        double total=gro+veg;
      
        System.out.println("--------------");
        System.out.println("Total : "+total);
    }
    
}
