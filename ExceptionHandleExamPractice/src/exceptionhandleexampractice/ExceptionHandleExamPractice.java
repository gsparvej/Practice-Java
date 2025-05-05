
package exceptionhandleexampractice;

import java.util.Scanner;


public class ExceptionHandleExamPractice {

   
    public static void main(String[] args) {
        
       
         try {
           
            int result = 10 / 0;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println(e);
        }

        


//        int result=10/0;
//        System.out.println("Result : "+result);
        
    }
    
}
