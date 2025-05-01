
package easy.shoping;

import java.util.Arrays;
import java.util.Scanner;



public class Male extends Shoping{

    private double mPrice;

    public Male() {
    }

    public Male(double mPrice) {
        this.mPrice = mPrice;
    }

    public Male(double mPrice, String sProductName, String sProductSize, String sCustomerAddress, String sCustomerContact) {
        super(sProductName, sProductSize, sCustomerAddress, sCustomerContact);
        this.mPrice = mPrice;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    @Override
    public String getDetails() {
    
        Scanner s=new Scanner(System.in);
        System.out.println("Enter How much bought (quantity) ");
        int quantiy=s.nextInt();
        String[] name=new String[quantiy];
        double[] myPrice=new double[quantiy];
        
        for(int i=0;i<quantiy;i++){
        
            System.out.print("Enter"+(i+1)+" Product Name : ");
             String userProduct=s.next();
             name[i]=userProduct;
        //    setmPrice(s.nextDouble());
            System.out.print("Product Price : ");
            double price=s.nextDouble();
            myPrice[i]=price;
         
            
        }
       
       
        return Arrays.toString(name)+"\n"+Arrays.toString(myPrice);
        
        
    
    }

    @Override
    public void getBothDetails() {
        
        Scanner s=new Scanner(System.in);
        
     //   System.out.println(getDetails());
     
        System.out.println("Male Details Please ");
        System.out.print("How Much You Bought : ");
       int quantiy=s.nextInt();
        String[] name=new String[quantiy];
        double[] myPrice=new double[quantiy];
        double sum=0;
        
        for(int i=0;i<quantiy;i++){
        
            System.out.print("Enter "+(i+1)+" Product Name : ");
             String userProduct=s.next();
             name[i]=userProduct;
        //    setmPrice(s.nextDouble());
            System.out.print("Product Price : ");
            double price=s.nextDouble();
            myPrice[i]=price;
            
            sum += myPrice[i];
            
           
         
            
        }
        
       

        System.out.println("Total sum :" + sum);
       System.out.println("Details :"+Arrays.toString(name)+"\n"+Arrays.toString(myPrice));
        
        
        
    }

    
}
