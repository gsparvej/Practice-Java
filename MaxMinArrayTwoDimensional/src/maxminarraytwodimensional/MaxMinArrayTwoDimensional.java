
package maxminarraytwodimensional;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArrayTwoDimensional {

    
    public static void main(String[] args) {
       
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array row size");
        int rows=s.nextInt();
        System.out.println("Enter array col size");
        int cols=s.nextInt();
       
        int[][] myArray=new int[rows][cols];
        
        System.out.println("Arrays : "+Arrays.deepToString(myArray));
        System.out.println("------------------------");
        
        for(int row=0;row<rows;row++){
        
            for(int col=0;col<cols;col++){
            
                System.out.print("["+row+"]"+"["+col+"]"+" :");
                myArray[row][col]=s.nextInt();
              
            }
        }
        System.out.println("Arrays : "+Arrays.deepToString(myArray));
        System.out.println("---------------------------");
        
        
    }
    
}
