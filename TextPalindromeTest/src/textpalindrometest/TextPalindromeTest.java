
package textpalindrometest;

import java.util.Scanner;


public class TextPalindromeTest {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a text for test Its Palindrome or Not : ");
        String text=s.next();
        text=text.toLowerCase();
        String reverse =" ";
        
        for(int i=text.length()-1;i>=0;i--){
        
            reverse+=text.charAt(i);
            
        }
        System.out.println("Reverse : "+reverse);
        
        
        if(text.equals(reverse)){
        
            System.out.println("Its Palindrome Word ");
        
        }
        else{
        
            System.out.println("Its Not Palindrome Word ");
        }
    }
    
}
