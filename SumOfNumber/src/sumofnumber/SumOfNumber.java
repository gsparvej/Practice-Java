
package sumofnumber;

import java.util.Scanner;


public class SumOfNumber {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        
        int input=s.nextInt();
        int digit;
        int sum=0;
        
        for(int i=1;i<=input;i++){
        
            digit=input%10;
            input=input/10;
            sum+=digit;
            System.out.print(digit+"+");
            
        }
        
        System.out.println("="+sum);
    }
    
}
