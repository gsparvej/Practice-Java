
package onlineshoppingsystemusinginheritance2.shopping;


public class Grocery extends Product2{
    private String groceryItem;

    public Grocery() {
    }

    public Grocery(String groceryItem) {
        this.groceryItem = groceryItem;
    }

    public Grocery(String groceryItem, int productPrice, String productId) {
        super(productPrice, productId);
        this.groceryItem = groceryItem;
    }

    public String getGroceryItem() {
        return groceryItem;
    }

    public void setGroceryItem(String groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getDetails() {
        return "Grocery Item : "+groceryItem+
                "\n"+super.getDetails(); 
    }
    
    
}
