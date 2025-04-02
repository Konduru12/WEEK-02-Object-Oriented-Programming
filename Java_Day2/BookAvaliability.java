public class BookAvaliability {
    String title;
    String Author;
    int price;
    boolean Avaliability;
    BookAvaliability(String title, String Author, int price, boolean Avaliability){
        this.title = title;
        this.Author = Author;
        this.price = price;
        this.Avaliability = Avaliability;
    }
    void checkAvaliablity(){
        if(Avaliability){
            System.out.println("Book is Avaliable.");
            Avaliability = false;
        }else{
            System.out.println("Book is not Avaliable.");
        }
    }
    void displaybookdetails(){
        System.out.println("Name: " + title + " Author: " + Author + " price " + price + " Availability: " + Avaliability);
    }
    public static void main(String[] args){
        BookAvaliability b1 = new BookAvaliability("Harry Pother", "Harry", 3000,false);
        BookAvaliability b2 = new BookAvaliability("Alone", "Bharath", 1000, true);
        b1.displaybookdetails();
        b2.displaybookdetails();
    }
    
}
