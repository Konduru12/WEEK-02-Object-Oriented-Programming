abstract class Vehicle{
    int vehicleNumber;
    String type;
    int rentalRate;
    Vehicle(int vehicleNumber, String type, int rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract int calculateRentalCost(int days);
    public void displayVehicleDetails(){
        System.out.println("Vehicle number:" + vehicleNumber);
        System.out.println("Vehicle type:" + type);
        System.out.println("Rental rate of Vehicle:" + rentalRate);
    }
}
interface Insurable{
    int calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    Car(int vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }
    public int calculateRentalCost(int days){
        return days*rentalRate;
    }
    public int calculateInsurance(){
        return (int)(rentalRate * 0.20);
    }
    public String getInsuranceDetails(){
        return "Car's Insurance rate : 20%";
    }
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
    }
}
class Bike extends Vehicle implements Insurable{
    Bike(int vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }
    public int calculateRentalCost(int days){
        return days*rentalRate;
    }
    public int calculateInsurance(){
        return (int)(rentalRate * 0.10);
    }
    public String getInsuranceDetails(){
        return "Car's Insurance rate : 10%";
    }
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
    }
}
class Truck extends Vehicle implements Insurable{
    Truck(int vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }
    public int calculateRentalCost(int days){
        return days*rentalRate;
    }
    public int calculateInsurance(){
        return (int)(rentalRate * 0.80);
    }
    public String getInsuranceDetails(){
        return "Car's Insurance rate : 80%";
    }
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
    }
}

public class VehicleRentalSystem{
    public static void main(String[] args){
        Car c1 = new Car(12345, "Car", 100);
        Bike v1 = new Bike(9801, "Bike", 500);
        Truck t1 = new Truck(2316, "Truck", 350);
        c1.displayVehicleDetails();
        c1.calculateRentalCost(20);
        c1.calculateInsurance();
        c1.getInsuranceDetails();
        v1.displayVehicleDetails();
        v1.calculateRentalCost(15);
        v1.calculateInsurance();
        v1.getInsuranceDetails();
        t1.displayVehicleDetails();
        t1.calculateRentalCost(4);
        t1.calculateInsurance();
        t1.getInsuranceDetails();
    }
}