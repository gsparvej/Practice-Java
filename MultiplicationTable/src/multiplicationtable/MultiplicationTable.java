
package multiplicationtable;

import java.util.Scanner;


public class MultiplicationTable {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Which Multiplication Table You Want To See : ");
        int input =s.nextInt();
       
        
        for(int i=1;i<=10;i++){
        
           
            System.out.println(input+" X "+i+"="+(input*i));
           // System.out.println(input+"X"+i+"="+mul);
        }
    }
    
}
