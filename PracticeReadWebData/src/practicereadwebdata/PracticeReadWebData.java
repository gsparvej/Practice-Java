
package practicereadwebdata;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;


public class PracticeReadWebData {

    
    public static void main(String[] args) {
       
        try {
            URL url=new URL("https://easyfashion.com.bd");
            Scanner scan=new Scanner(url.openStream());
            System.out.println(scan.nextLine());
            Pattern p=Pattern.compile("<[^>]+>");
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(PracticeReadWebData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PracticeReadWebData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
