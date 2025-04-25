
package randommathguessnumber;

import java.util.Scanner;


public class RandomMathGuessNumber {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int count=0;
        boolean status=false;
        int random=(int) (Math.random()*10);
        System.out.println("Random Number : "+random);
        
        
        
        while(count <3 ){
        
            System.out.println("Enter Your Guess : ");
            int guess=s.nextInt();
            
         if(guess==random){
        
            System.out.println("You Are Win ");
           status=true;
           break;
        }
        else if(!(guess==random) ){
        
            System.out.println("Try Again");
          
            status=false;
            
        
        }
//        else{
//        
//            System.out.println("Better Luck Next Time ");
//            
//        }
         count++;
        
       
        }
        if (!false) {
            System.out.println("Better Luck Next Time! The correct number was: " + random);
        }
        
       
        
    }
    
}
