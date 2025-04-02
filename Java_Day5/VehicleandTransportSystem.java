class Vehicle{
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo(){
        System.out.println("Maximum Speed of Vehicle:" + maxSpeed);
        System.out.println("Fuel Type of Vehicle:" + fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo(){
        System.out.println("Seat Capacity of Car:" + seatCapacity);
        super.displayInfo();
    }
}
class Truck extends Vehicle{
    String colour;
    Truck(int maxSpeed, String fuelType, String colour){
        super(maxSpeed, fuelType);
        this.colour = colour;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Enter the colour of Truck:" + colour);
    }
}
class MotorCycle extends Vehicle{
    int cost;
    MotorCycle(int maxSpeed, String fuelType, int cost){
        super(maxSpeed, fuelType);
        this.cost = cost;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Enter the cost of Motor cycle:" + cost);
    }
}
public class VehicleandTransportSystem {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle(20000,"Petrol");
        Car c1 = new Car(250,"Petrol", 4);
        Truck t1 = new Truck(230, "Diesel", "Red");
        MotorCycle m1 = new MotorCycle(210, "No fuel", 10000);
        v1.displayInfo();
        c1.displayInfo();
        t1.displayInfo();
        m1.displayInfo();
    }
}
