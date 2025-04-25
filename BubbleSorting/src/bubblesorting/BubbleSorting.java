
package bubblesorting;

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSorting {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array size ");
        int input=s.nextInt();
        int temp;
        
        int[] myArray=new int[input];
        
        for(int index=0;index<input;index++){
        
            System.out.println("Enter "+(index+1));
            int userInput=s.nextInt();
            myArray[index]=userInput;
            
            
            
        
        }
        System.out.println("My Arrays : "+Arrays.toString(myArray));
        
        
        for(int i=0;i<myArray.length;i++){
        
            for(int j=0;j<myArray.length-i-1;j++){
            
                if(myArray[j]>myArray[j+1]){
                
                    temp = myArray[j];
                    myArray[j]=myArray[j+1];
                    myArray[j+1]=temp;
                }
         
            }
            
        }
        System.out.println("My Arrays : "+Arrays.toString(myArray));
        
    }
    
}
