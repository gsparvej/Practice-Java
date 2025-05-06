

package libraryitemusinginheritance2.newLibrary;



public class Newspaper2 extends Library2 {
    
    private int newsPrice;

    public Newspaper2() {
    }

    public Newspaper2(int newsPrice) {
        this.newsPrice = newsPrice;
    }

    public Newspaper2(int newsPrice, String title, String author, String name) {
        super(title, author, name);
        this.newsPrice = newsPrice;
    }

    public int getNewsPrice() {
        return newsPrice;
    }

    public void setNewsPrice(int newsPrice) {
        this.newsPrice = newsPrice;
    }

    @Override
    public String getDetails() {
        return "\nNewspaper Price : "+newsPrice+"\n"+ super.getDetails(); 
    }
    
    
}
