
package easy.shoping;

import java.util.Arrays;
import java.util.Scanner;



public class Female extends Male{

    private double fPrice;

    public Female() {
    }

    public Female(double fPrice) {
        this.fPrice = fPrice;
    }

    public Female(double fPrice, double mPrice) {
        super(mPrice);
        this.fPrice = fPrice;
    }

    public Female(double fPrice, double mPrice, String sProductName, String sProductSize, String sCustomerAddress, String sCustomerContact) {
        super(mPrice, sProductName, sProductSize, sCustomerAddress, sCustomerContact);
        this.fPrice = fPrice;
    }

    public double getfPrice() {
        return fPrice;
    }

    public void setfPrice(double fPrice) {
        this.fPrice = fPrice;
    }

    @Override
    public void getBothDetails() {
        
        
         Scanner s=new Scanner(System.in);
         
     //   System.out.println(getDetails());
     
        System.out.println("Female Details Please ");
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
    
    
//    public void getFinalPrice(){
//
//        String total="";
//        
//        total=getBothDetails()
//
//
//        }
    
    }
