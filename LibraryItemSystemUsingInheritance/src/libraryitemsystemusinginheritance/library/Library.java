

package libraryitemsystemusinginheritance.library;

import java.util.Scanner;


public class Library {
    
    private String title;
    private String author;
    private String name;

    public Library() {
    }

    public Library(String title, String author, String name) {
        this.title = title;
        this.author = author;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getdetail(){
    
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Title : ");
        title=s.nextLine();
        System.out.println("Enter Author Name : ");
        author=s.nextLine();
        System.out.println("Enter Item Name : ");
        name=s.nextLine();
              
    
    return " Title : "+title+"\n Author Name Is : "+author+"\n Name : "+name;
    }
    
    public void displayInfo(){
    
        System.out.println(getdetail());
    }
}

