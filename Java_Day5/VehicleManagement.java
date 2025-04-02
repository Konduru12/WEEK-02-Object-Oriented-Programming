class Vehicle{
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    void display(){
        System.out.println("Max Speed:" + maxSpeed);
        System.out.println("Model of the Vehicle:" + model);
    }
}
interface Refuelable{
    void refuel();
}
class ElectricalVehicle extends Vehicle{
    ElectricalVehicle(int maxSpeed,String model){
        super(maxSpeed, model);
    }
    void charge(){
        System.out.println("Please charge me");
    }
    void display(){
        super.display();
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }
    @Override
    public void refuel(){
        System.out.println("Please refuel me");
    }
    void display(){
        super.display();
    }
}
public class VehicleManagement {
    public static void main(String[] args){
    Vehicle v1 = new Vehicle(200, "Van");
    ElectricalVehicle e1 = new ElectricalVehicle(120, "Bike");
    PetrolVehicle p1 = new PetrolVehicle(150, "Petrol car");
    v1.display();
    e1.display();
    e1.charge();
    p1.display();
    p1.refuel();

}
}

