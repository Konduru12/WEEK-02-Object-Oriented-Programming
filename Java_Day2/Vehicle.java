public class Vehicle {
    String ownerName;
    String vehicleType;
    static int RegistrationFee = 10000;
    Vehicle(String ownerName, String vehicleType, int RegistrationFee){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    static void changingRegFee(int newfee){
        RegistrationFee = newfee;
    }
    void displayVehicleDetails(){
        System.out.println("Name of the Owner: " + ownerName + " Type of Vehicle: " + vehicleType + " Registration Fee: " + RegistrationFee);
    }
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Abhinaya", "Bike", 200);
        Vehicle v2 = new Vehicle("Sasanka", "Car", 300);
        v1.displayVehicleDetails();
        Vehicle.changingRegFee(100);
        v2.displayVehicleDetails();
    }
}
