
package findfactorialnumberusingbiginteger;

import java.math.BigInteger;
import java.util.Scanner;


public class FindFactorialNumberUsingBigInteger {

   
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value ");
       int input=s.nextInt();
        BigInteger factorial=BigInteger.ONE;
        
        for(int i=1;i<=input;i++){
        
            factorial=factorial.multiply(BigInteger.valueOf(i));
        
        }
        System.out.println("The Factorial of "+input+" is : "+factorial);
    }
    
}
