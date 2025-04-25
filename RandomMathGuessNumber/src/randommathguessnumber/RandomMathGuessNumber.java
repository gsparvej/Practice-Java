
package randommathguessnumber;

import java.util.Scanner;


public class RandomMathGuessNumber {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Guess a Number : ");
        int a=s.nextInt();
        int random=(int) (Math.random()*10);
        System.out.println("Random Number : "+random);
        
        if(a==random){
        
            System.out.println("You Are Win ");
        }
        else{
        
            System.out.println("Better Luck Next Time ");
        }
        
    }
    
}
