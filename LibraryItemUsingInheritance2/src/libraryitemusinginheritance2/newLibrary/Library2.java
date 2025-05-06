

package libraryitemusinginheritance2.newLibrary;



public class Library2 {
    
    private String title;
    private String author;
    private String name;

    public Library2() {
    }

    public Library2(String title, String author, String name) {
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
    
    public String getDetails(){
   
    return "Name : "+name+"\n"+"Author Name : "+author+"\n"+"Title : "+title;
    }
}
