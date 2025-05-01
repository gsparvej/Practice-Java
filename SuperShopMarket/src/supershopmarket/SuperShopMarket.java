package supershopmarket;

import supershopmarket.Shop.Grocery;
import supershopmarket.Shop.Vegetables;

public class SuperShopMarket {

    public static void main(String[] args) {

        Grocery g = new Grocery();
        Vegetables v = new Vegetables();

        v.setgPrice(5000);
        v.setvPrice(200 + 200 + 5000);

        System.out.println("" + v.calculateTotalPrice());
        
        System.out.println("--------------");
    }

}
