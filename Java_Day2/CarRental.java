public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    int price;
    CarRental(String customerName, String carModel, int rentalDays, int price){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.price = price;
    }
    void CalculateCost(int Totalcost){
        Totalcost = rentalDays * price;
        System.out.println("The total cost is:" + Totalcost);
    }
    void displaycardetails(){
        System.out.println("Customer name:" + customerName + " Car model: " + carModel + " How many days: " + rentalDays);
    }
    public static void main(String[] args){
        CarRental car1 = new CarRental("Abhi", "Renault", 2, 300);
        car1.displaycardetails();
        car1.CalculateCost(300);
    }

}
