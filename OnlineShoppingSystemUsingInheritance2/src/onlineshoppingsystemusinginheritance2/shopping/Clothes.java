
package onlineshoppingsystemusinginheritance2.shopping;


public class Clothes extends Product2{
    private String clothesItem;
    private String clothSize;

    public Clothes() {
    }

    public Clothes(String clothesItem, String clothSize) {
        this.clothesItem = clothesItem;
        this.clothSize = clothSize;
    }

    public Clothes(String clothesItem, String clothSize, int productPrice, String productId) {
        super(productPrice, productId);
        this.clothesItem = clothesItem;
        this.clothSize = clothSize;
    }

    public String getClothesItem() {
        return clothesItem;
    }

    public void setClothesItem(String clothesItem) {
        this.clothesItem = clothesItem;
    }

    public String getClothSize() {
        return clothSize;
    }

    public void setClothSize(String clothSize) {
        this.clothSize = clothSize;
    }

    @Override
    public String getDetails() {
        return "Clothes Item : "+clothesItem+
                "\nCloth Size : "+clothSize+
                 "\n"+super.getDetails(); 
    }
    
    
}
