
package practicefileclass;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PracticeFileClass {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Folder number ");
        int limit=s.nextInt();
        
        for(int i=1;i<=limit;i++){
        
            System.out.println("Enter Folder Name ");
            String folderName=s.next();
            System.out.print("Enter Content :");
            s.nextLine();
            String content=s.nextLine();
            
            try {
                PrintWriter pw=new PrintWriter("C:\\Users\\MY COMPUTER\\Documents\\"+folderName+".txt");
                pw.print(content);
                pw.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PracticeFileClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
    }
    
}
