
package libraryitemusinginheritance2;


import java.awt.print.Book;
import java.util.Scanner;
import libraryitemusinginheritance2.newLibrary.Book2;
import libraryitemusinginheritance2.newLibrary.Library2;
import libraryitemusinginheritance2.newLibrary.Magazine2;


public class LibraryItemUsingInheritance2 {

    
    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);
        
        Library2 l=new Library2();
        Book2 b=new Book2();
        Magazine2 m=new Magazine2();
        
        System.out.print("How Much Item You Bought : ");
        int bought=scan.nextInt();

        for(int i=1;i<=bought;i++){
        
        System.out.print("Its Book/Magazine/Newspaper : ");
        String item=scan.next();
      //  scan.next();
        
            if(item.equalsIgnoreCase("Book")){
        
        System.out.print("Enter Book Name : ");
        scan.nextLine();
        b.setName(scan.nextLine());
        System.out.print("Enter Author Name : ");
       // scan.nextLine();
        b.setAuthor(scan.nextLine());
      //  scan.nextLine();
        System.out.print("Enter Book's Title : ");
        b.setTitle(scan.nextLine());
        System.out.print("Enter Book's Price : ");
        b.setbPrice(scan.nextInt());
        }
           
            else if(item.equalsIgnoreCase("Magazine")){
                
        System.out.print("Enter Magazine Name : ");
        scan.nextLine();
        m.setName(scan.nextLine());
        System.out.print("Enter Author Name : ");
        m.setAuthor(scan.nextLine());
        System.out.print("Enter Magazine's Title : ");
        m.setTitle(scan.nextLine());
        System.out.print("Enter Magazine's Price : ");
        m.setMagaPrice(scan.nextInt());
                
                
            }
        
        }
      
        // ********* nicher part tuku manually book or magazine er jnno .............*****************
        
//        System.out.print("Enter Book Name : ");
//        b.setName(scan.nextLine());
//        System.out.print("Enter Author Name : ");
//        b.setAuthor(scan.nextLine());
//        System.out.print("Enter Book's Title : ");
//        b.setTitle(scan.nextLine());
//        System.out.print("Enter Book's Price : ");
//        b.setbPrice(scan.nextInt());
        System.out.println("------------------------");
//        System.out.print("Enter Magazine Name : ");
//        scan.nextLine();
//        m.setName(scan.nextLine());
//        System.out.print("Enter Author Name : ");
//        m.setAuthor(scan.nextLine());
//        System.out.print("Enter Magazine's Title : ");
//        m.setTitle(scan.nextLine());
//        System.out.print("Enter Magazine's Price : ");
//        m.setMagaPrice(scan.nextInt());
        
        System.out.println("--------------------------");
        System.out.println("Book's Details : "+b.getDetails());
        System.out.println("--------------------------");
        System.out.println("Magazine's Details : "+m.getDetails());
    }
    
}
