
package readdatafromwebusingtrycatch;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadDataFromWebUsingTryCatch {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter web address");
        String myURL = scan.next();
        System.out.println("Enter file name");
        String fileName = scan.next();
       
        try {
         
             URL url=new URL("https://" + myURL);
            Scanner s=new Scanner(url.openStream());
            Pattern p=Pattern.compile("<[^>]+>");
            String result="";
           
         //   System.out.println(s.nextLine());
         
         while(s.hasNext()){
         
//             s.nextLine();
//             Matcher matcher=p.matcher(result);
//             System.out.println(result);
             
//             while(matcher.find()){
             
           result+=s.nextLine();
           
                
                
//             }
             
         }
         
            PrintWriter pw=new PrintWriter("C:\\Users\\MY COMPUTER\\Documents\\"+fileName+".html");
            pw.println(result);
            System.out.println("Create Done ! ");
            pw.close();
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadDataFromWebUsingTryCatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadDataFromWebUsingTryCatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
