
package libraryitemusinginheritance2;


import java.util.Scanner;
import libraryitemusinginheritance2.newLibrary.Book2;
import libraryitemusinginheritance2.newLibrary.Library2;


public class LibraryItemUsingInheritance2 {

    
    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);
        
        Library2 l=new Library2();
        Book2 b=new Book2();
        
        System.out.print("Enter Book Name : ");
        b.setName(scan.nextLine());
        System.out.print("Enter Author Name : ");
        b.setAuthor(scan.nextLine());
        System.out.print("Enter Book's Title : ");
        b.setTitle(scan.nextLine());
        System.out.print("Enter Book's Price : ");
        b.setbPrice(scan.nextInt());
        System.out.println("-----------------------");
        System.out.println("Book's Details : "+b.getDetails());
        
        
    }
    
}
