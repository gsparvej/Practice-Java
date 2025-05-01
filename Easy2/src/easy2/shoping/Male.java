

package easy2.shoping;

import java.util.Date;
import java.util.Scanner;


public class Male extends Shoping{
    
    private String mItems;
    private double mPrice;

    public Male() {
    }

    public Male(String mItems, double mPrice) {
        this.mItems = mItems;
        this.mPrice = mPrice;
    }

    public Male(String mItems, double mPrice, String customerName, String contactNumber, String customerAddress, Date buyDate, double salePrice, double totalPrice, String productName) {
        super(customerName, contactNumber, customerAddress, buyDate, salePrice, totalPrice, productName);
        this.mItems = mItems;
        this.mPrice = mPrice;
    }

    

    @Override
    public String getCustomerDetails() {
         
        String mDetail=" ";
       
         Scanner s=new Scanner(System.in);
         System.out.println("Customer Gender ");
         String gender=s.nextLine();
         
         if (gender.equalsIgnoreCase("Mr")) {
             //  System.out.println("Male Customers Details : ");
               System.out.print("Male Customer Name : ");
               setCustomerName(s.nextLine());
            } else if (gender.equalsIgnoreCase("Mrs")) {
              //  System.out.println("Female Customers Details : ");
                System.out.print("Female Customer Name : ");
                setCustomerName(s.nextLine());
            } else {
                System.err.println("Invalid choice");
            }
         
         System.out.print("Enter Customer Contact Number : ");
         setContactNumber(s.nextLine());
         System.out.print("Enter Customer Address : ");
         setCustomerAddress(s.nextLine());
         System.out.println("-------------------------------");
         mDetail ="Customer Name : "+getCustomerName()+"\n"+
                 "Contact Number : "+getContactNumber()+"\n"+
                 "Address : "+getCustomerAddress();
         
        return mDetail;
    }
    
    
    
}
