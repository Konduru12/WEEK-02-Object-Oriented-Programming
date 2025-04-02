abstract class LibraryItem{
    String itemId;
    String title;
    String author;
    LibraryItem(String itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    void getItemDetails(){
        System.out.println("Item Id:" + itemId);
        System.out.println("Title of the book:" + title);
        System.out.println("Author of Book:" + author);
    }
    public abstract int getLoanDuration();
}
interface Reservable{
    void reserveItem();
    void checkAvailability();
}
class Book extends LibraryItem implements Reservable{
    Book(String itemId, String title, String author){
        super(itemId, title, author);
    }
    void getItemDetails(){
        super.getItemDetails();
    }
    public int getLoanDuration(){
        return 20;
    }
    public void reserveItem(){
        System.out.println("Item reserved Successfully");
    }
    public void checkAvailability(){
        if(itemId != null){
            System.out.println("Item is available");
        }else{
            System.out.println("Item is not available");
        }
    }
}
class Magazine extends LibraryItem{
    Magazine(String itemId, String title, String author){
        super(itemId, title, author);
    }
    void getItemDetails(){
        super.getItemDetails();
    }
    public int getLoanDuration(){
        return 30;
    }
    public void reserveItem(){
        System.out.println("Item reserved Successfully");
    }
    public void checkAvailability(){
        if(itemId != null){
            System.out.println("Item is available");
        }else{
            System.out.println("Item is not available");
        }
    }
}

class DVD extends LibraryItem{
    DVD(String itemId, String title, String author){
        super(itemId, title, author);
    }
    void getItemDetails(){
        super.getItemDetails();
    }
    public int getLoanDuration(){
        return 15;
    }
    public void reserveItem(){
        System.out.println("Item reserved Successfully");
    }
    public void checkAvailability(){
        if(itemId != null){
            System.out.println("Item is available");
        }else{
            System.out.println("Item is not available");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args){
        Book b1 = new Book("2341", "HarryPother" , "Harry");
        Magazine m1 = new Magazine("3425", "Veena", "Lakshmi");
        DVD d1 = new DVD("3214", "Digital player" , "Unknown");
        b1.getItemDetails();
        b1.getLoanDuration();
        b1.reserveItem();
        b1.checkAvailability();
        m1.getItemDetails();
        m1.getLoanDuration();
        m1.reserveItem();
        m1.checkAvailability();
        d1.getItemDetails();
        d1.getLoanDuration();
        d1.reserveItem();
        d1.checkAvailability();
    }
}
