

package filereadandwriteexampractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadAndWriteExamPractice {

  
    public static void main(String[] args) {
       
//        try {
//            PrintWriter pw=new PrintWriter("C:\\Users\\MY COMPUTER\\Desktop\\practice.txt");
//            pw.println("Hello java ");
//            System.out.println("File Created .");
//            pw.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileReadAndWriteExamPractice.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        File f=new File("C:\\Users\\MY COMPUTER\\Desktop\\practice.txt");
        try {
            Scanner s=new Scanner(f);
            while(s.hasNext()){
            
            System.out.println("Your Text : "+s.nextLine());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadAndWriteExamPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
