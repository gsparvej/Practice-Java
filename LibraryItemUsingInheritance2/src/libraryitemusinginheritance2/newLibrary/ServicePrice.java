
package libraryitemusinginheritance2.newLibrary;


public class ServicePrice {
    
    Library2[] library;
    Book2[] book;
    Magazine2[] maga;
    Newspaper2[] newspaper;

    public ServicePrice() {
    }

    public ServicePrice(Library2[] library, Book2[] book, Magazine2[] maga, Newspaper2[] newspaper) {
        this.library = library;
        this.book = book;
        this.maga = maga;
        this.newspaper = newspaper;
    }

   
    
    public String calculateTotal(){
    
    double bTotal=0;
    double nTotal=0;
    double mTotal=0;

    for(int i=0;i<book.length;i++){
    
    
        bTotal+=book[i].getbPrice();
    }
    for(int j=0;j<maga.length;j++){
    
        mTotal+=maga[j].getMagaPrice();
    
    }
 for(int j=0;j<newspaper.length;j++){
    
        nTotal+=newspaper[j].getNewsPrice();
    
    }

    
    
    return "Total : "+bTotal+mTotal+nTotal;
    }
}
