
package readdatafromwebusingtrycatch;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadDataFromWebUsingTryCatch {

   
    public static void main(String[] args) {
       
        try {
            URL url=new URL("https://www.facebook.com/index.html");
            Scanner s=new Scanner(url.openStream());
            Pattern p=Pattern.compile("<[^>]+>");
           
         //   System.out.println(s.nextLine());
         
         while(s.hasNext()){
         
             String text=s.nextLine();
             Matcher matcher=p.matcher(text);
             System.out.println(text);
             
             while(matcher.find()){
             
                 System.out.println(matcher.group());
             }
         
         }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadDataFromWebUsingTryCatch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadDataFromWebUsingTryCatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
