
package libraryitemsystemusinginheritance.library;


public class Newspaper extends Library {
    
    private int newsPrice;

    public Newspaper() {
    }

    public Newspaper(int newsPrice) {
        this.newsPrice = newsPrice;
    }

    public Newspaper(int newsPrice, String title, String author, String name) {
        super(title, author, name);
        this.newsPrice = newsPrice;
    }

    public int getNewsPrice() {
        return newsPrice;
    }

    public void setNewsPrice(int newsPrice) {
        this.newsPrice = newsPrice;
    }
    
    
    
}
