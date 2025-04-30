package supershopmarket;

import supershopmarket.Shop.Grocery;
import supershopmarket.Shop.Vegetables;

public class SuperShopMarket {

    public static void main(String[] args) {

        Grocery g = new Grocery();
        Vegetables v = new Vegetables();

        v.setgPrice(5000);
        v.setvPrice(200 + 200 + 500);

        System.out.println("" + v.calculateTotalPrice());

//        double gro=g.getSalePrice();
//        double veg=v.getSalePrice();
//        double total=gro+veg;
        System.out.println("--------------");
//        System.out.println("Total : "+total);
    }

}
