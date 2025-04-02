class Book{
    String title;
    int publicationYear;
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayBookDetails(){
        System.out.println("Title of the book:" + title);
        System.out.println("Year of Publication:" + publicationYear);
    }

}
class Author extends Book{
    String name;
    int bio;
    Author(String title, int publicationYear, String name, int bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayBookDetails(){
        super.displayBookDetails();
        System.out.println("Name of the book Author:" + name);
        System.out.println("Author's age:" + bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args){
        Book b1 = new Book("Harry pother", 1990);
        Author a1 = new Author("Harry pother", 1990, "Harry", 20);
        b1.displayBookDetails();
        a1.displayBookDetails();
    }
}
