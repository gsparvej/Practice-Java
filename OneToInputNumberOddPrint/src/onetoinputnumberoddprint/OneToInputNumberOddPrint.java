
package onetoinputnumberoddprint;

import java.util.Scanner;


public class OneToInputNumberOddPrint {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("How much you want to see Odd Number : ");
        int input=s.nextInt();
        
        for(int i=1;i<input;i++){
        
            if(i%2==1){
            
                System.out.print(+i+" ");
            
            }
        
        }
    }
    
}
