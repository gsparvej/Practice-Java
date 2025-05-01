
package easy2.shoping;

import java.util.Date;
import java.util.Scanner;


public class Female extends Male{

    private String fItems;
    private double fPrice;

    public Female() {
    }

    public Female(String fItems, double fPrice) {
        this.fItems = fItems;
        this.fPrice = fPrice;
    }

    public Female(String fItems, double fPrice, String mItems, double mPrice) {
        super(mItems, mPrice);
        this.fItems = fItems;
        this.fPrice = fPrice;
    }

    public Female(String fItems, double fPrice, String mItems, double mPrice, String customerName, String contactNumber, String customerAddress, Date buyDate, double salePrice, double totalPrice, String productName) {
        super(mItems, mPrice, customerName, contactNumber, customerAddress, buyDate, salePrice, totalPrice, productName);
        this.fItems = fItems;
        this.fPrice = fPrice;
    }

    

    
    public String getSalingDetails(){
    String salingDetail=" ";
    
    Scanner s=new Scanner(System.in);
    
    // ekhan theke suru korbo..........
    
    return salingDetail;
    }
    
}
