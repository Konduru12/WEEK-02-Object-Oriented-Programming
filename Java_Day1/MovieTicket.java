public class MovieTicket {
    String movieName;
    int seatNumber;
    int price;
    MovieTicket(String movieName, int seatNumber, int price){
        this.movieName = movieName;
        this.seatNumber = -1;
        this.price = 0;
    }
    void bookTicket(int seatNumber, int price){
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked Successfully");
    }
    void displayTicket(){
        if(seatNumber == -1){
            System.out.println("No ticket booked yet for " + movieName);
        }else{
            System.out.println("movieName: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }
    }
    public static void main(String[] args){
        MovieTicket ticket = new MovieTicket("Court",20,890);
        ticket.bookTicket(20, 200);
        ticket.displayTicket();
    }
    

}
