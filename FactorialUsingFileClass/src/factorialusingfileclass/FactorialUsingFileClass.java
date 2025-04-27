
package factorialusingfileclass;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FactorialUsingFileClass {

    
    public static void main(String[] args) {
        
        
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Number to Find Factorial ");
        int f=s.nextInt();
        
        int factorial=1;
        
        for(int i=1;i<=f;i++){
        
            factorial*=i;
                 
           
        
        }
        System.out.println(""+factorial);
        try {
            PrintWriter pw=new PrintWriter("C:\\Users\\MY COMPUTER\\Documents\\p.txt");
             pw.print("Factorial is : "+factorial);
            pw.close();
             
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FactorialUsingFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
    }
    
}
