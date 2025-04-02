public class Book {
    String title;
    String author;
    double price;
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displaybookdetails(){
        System.out.println("Book name: " + title + " Author: " + author + " Price: " + price);
    }
    public static void main(String[] args){
        Book b1 = new Book("Harry pother" , "Harry", 1000);
        Book b2 = new Book("ALone", "Tagore", 1500);
        b1.displaybookdetails();
        b2.displaybookdetails();
    }
}
