

package libraryitemsystemusinginheritance.library;




public class Magazine extends Library {
    
    private int magaPrice;

    public Magazine() {
    }

    public Magazine(int magaPrice) {
        this.magaPrice = magaPrice;
    }

    public Magazine(int magaPrice, String title, String author, String name) {
        super(title, author, name);
        this.magaPrice = magaPrice;
    }

    public int getMagaPrice() {
        return magaPrice;
    }

    public void setMagaPrice(int magaPrice) {
        this.magaPrice = magaPrice;
    }
    
    
    
}
