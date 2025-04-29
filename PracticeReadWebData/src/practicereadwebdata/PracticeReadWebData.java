
package practicereadwebdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;


public class PracticeReadWebData {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Web Address : ");
        String webName=s.next();
        System.out.print("Enter File Name : ");
        String fileName=s.next();
        String result="";
       
        try {
            URL url=new URL("https://"+webName);
            Scanner scan=new Scanner(url.openStream());
            
            
            while(s.hasNext()){
            
                result+=s.nextLine();
                System.out.println(result);
            
            }
            
            
            PrintWriter pw=new PrintWriter("C:\\Users\\MY COMPUTER\\Documents\\"+fileName+".html");
            pw.print(result);
            System.out.println("Done !");
            pw.close();
           
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(PracticeReadWebData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PracticeReadWebData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
