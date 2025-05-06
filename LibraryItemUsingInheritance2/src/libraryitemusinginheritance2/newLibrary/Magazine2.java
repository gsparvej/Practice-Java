

package libraryitemusinginheritance2.newLibrary;



public class Magazine2 extends Library2 {
    
    private int magaPrice;

    public Magazine2() {
    }

    public Magazine2(int magaPrice) {
        this.magaPrice = magaPrice;
    }

    public Magazine2(int magaPrice, String title, String author, String name) {
        super(title, author, name);
        this.magaPrice = magaPrice;
    }

    public int getMagaPrice() {
        return magaPrice;
    }

    public void setMagaPrice(int magaPrice) {
        this.magaPrice = magaPrice;
    }

    @Override
    public String getDetails() {
        return super.getDetails(); 
    }
    
    
}
