

package libraryitemusinginheritance2.newLibrary;



public class Book2 extends Library2 {
    
    private int bPrice;

    public Book2() {
    }

    public Book2(int bPrice) {
        this.bPrice = bPrice;
    }

    public Book2(int bPrice, String title, String author, String name) {
        super(title, author, name);
        this.bPrice = bPrice;
    }

    public int getbPrice() {
        return bPrice;
    }

    public void setbPrice(int bPrice) {
        this.bPrice = bPrice;
    }

    @Override
    public String getDetails() {
        
        return "\nBook Price : "+bPrice+"\n"+super.getDetails(); 
    }
    
    
}
