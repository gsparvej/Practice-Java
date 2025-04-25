
package maxminusingfooreachloop;

import java.util.Arrays;
import java.util.Scanner;


public class MaxMinUsingFoorEachLoop {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array size");
        int input=s.nextInt();
        
        String result;
        int maxNumber=0;
        int minNumber=999999999;
        
        int[] myNumbers=new int[input];
        
        for(int index=0;index<input;index++){
        
            System.out.println("Input "+(index+1)+position(index+1));
            int userInput=s.nextInt();
            myNumbers[index]=userInput;
        }
        int index = 0;
        
        
       
        System.out.println("My Numbers :"+Arrays.toString(myNumbers));
        
        for(int number : myNumbers){
        
            if(number>maxNumber){
            
            maxNumber=number;
            }
        }
        for(int number: myNumbers){
        
            if(number<minNumber){
            minNumber=number;
            
            }
        }
        System.out.println("Max Number is :"+maxNumber);
        System.out.println("Min Number is :"+minNumber);
        
    }
    
    public static String position(int number){
    
         switch (number) {
            case 1: 
            return "st";
                case 2: 
             return "nd";
                
                case 3: 
             return"rd";
                
                
            default:
                return"th";
        }
        
    }
    
}
