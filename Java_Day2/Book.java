public class Book {
    String title;
    String author;
    int price;
    Book(){
        title = "Harry pother";
        author = "Harry";
        price = 7000;
    }
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displaydetails(){
        System.out.println("Book Name: " + title + " Author: " + author + " Price: " + price);
    }
    public static void main(String[] args){
        Book b1 = new Book("Alone", "Bharath", 2000);
        Book b2 = new Book("Freedom", " Abhinaya", 10000);
        Book b3 = new Book();
        b1.displaydetails();
        b2.displaydetails();
        b3.displaydetails();
    }
}
