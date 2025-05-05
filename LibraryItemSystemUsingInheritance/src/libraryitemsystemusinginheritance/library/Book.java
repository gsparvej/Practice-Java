

package libraryitemsystemusinginheritance.library;

import java.util.Scanner;



public class Book extends Library {
    
    private int bPrice;

    public Book() {
    }

    public Book(int bPrice) {
        this.bPrice = bPrice;
    }

    public Book(int bPrice, String title, String author, String name) {
        super(title, author, name);
        this.bPrice = bPrice;
    }

    @Override
    public void displayInfo() {
        
        
        super.displayInfo(); 
    }

    @Override
    public String getdetail() {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Book's Price : ");
        bPrice=s.nextInt();
        
        return super.getdetail()+" \n Book's Price is : "+bPrice; 
    }
    
    
}
