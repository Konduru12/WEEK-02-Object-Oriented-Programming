public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        guestName = "Abhinaya";
        roomType = "Modern";
        nights = 2;
    }
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking others){
        this.guestName = others.guestName;
        this.roomType = others.roomType;
        this.nights = others.nights;
    }
    void displayGuestdetails(){
        System.out.println("Name of the guest: " + guestName);
        System.out.println("Tyoe of Room: "  + roomType);
        System.out.println("Number of nights:" + nights);
    }
    public static void main(String[] args){
        HotelBooking g1 = new HotelBooking("Sasanka", "Claasic", 2);
        HotelBooking g2 = new HotelBooking(g1);
        HotelBooking g3 = new HotelBooking();
        g1.displayGuestdetails();
        g2.displayGuestdetails();
        g3.displayGuestdetails();
    }
}
