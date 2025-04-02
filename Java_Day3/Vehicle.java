public class Vehicle {
    static int registrationFee;
    String ownerName;
    String vehicleType;
    final int registrationNumber;
    Vehicle(String ownerName, String vehicleType, int registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    static void updateRegistrationFee(int newfee){
        registrationFee = newfee;
    }
    void displayVehicleDetails(){
        System.out.println("Enter the Owner name:" + ownerName);
        System.out.println("Enter the Vehicle type:" + vehicleType);
        System.out.println("Enter the Registration number:" + registrationNumber);
        System.out.println("Enter the Registration fee:" + registrationFee);
    }
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Abhinaya", "Bike", 2019);
        Vehicle v2 = new Vehicle("Sasanka", "Car", 2134);
        if(v1 instanceof Vehicle){
            System.out.println("v1 is an object of Vehicle");
        }else{
            System.out.println("v1 is not an object of Vehicle");
        }
        Vehicle.updateRegistrationFee(100);
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(200);
        if(v2 instanceof Vehicle){
            System.out.println("v2 is an object of Vehicle");
        }else{
            System.out.println("v2 is not an object of Vehicle");
        }
        v2.displayVehicleDetails();
    }
}
