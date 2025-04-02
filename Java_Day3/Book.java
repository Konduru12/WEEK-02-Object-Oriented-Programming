public class Book {
    static String libraryName = "BOOKS HOUSE";
    String title;
    String author;
    final int isbn;
    Book(String title,String author,int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    void displaybookdetails(){
        System.out.println("Name of the Library:" + libraryName);
        System.out.println("Name of the book:" + title);
        System.out.println("Name of the Author:" + author);
        System.out.println("Enter the isbn number:" + isbn);
    }
    public static void main(String[] args){
        Book b1 = new Book("Harry Pother" , "Harry", 12345);
        Book b2 = new Book("Alone", "Bharath", 2367);
        if(b1 instanceof Book){
            System.out.println("B1 is instance of Book");
            b1.displaybookdetails();
        }else{
            System.out.println("B1 is not instance of Book");
        }
        if(b2 instanceof Book){
            System.out.println("B2 is instance of Book");
            b2.displaybookdetails();
        }else{
            System.out.println("B2 is not instance of Book");
        }
        
    }
}
