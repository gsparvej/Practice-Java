
package multiplicationtable;

import java.util.Scanner;


public class MultiplicationTable {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Which Multiplication Table You Want To See");
        int input =s.nextInt();
        int mul=1;
        
        for(int i=1;i<=10;i++){
        
            mul*=i;
            System.out.println(input+"X"+i+"="+mul);
           // System.out.println(input+"X"+i+"="+mul);
        }
    }
    
}
