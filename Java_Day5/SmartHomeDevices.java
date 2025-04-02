class Device{
    int deviceId;
    String status;
    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus(){
        System.out.println("Enter the Device Id:" + deviceId);
        System.out.println("Enter the device status:" + status);
    }
}
class Thermostat extends Device{
    String temperaturSetting;
    Thermostat(int deviceId, String status, String temperaturSetting){
        super(deviceId,status);
        this.temperaturSetting = temperaturSetting;
    }
    @Override
    void displayStatus(){
        super.displayStatus();
        System.out.println("Enter the Temperature Settings:" + temperaturSetting);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args){
        Device d1 =new Device(101, "off");
        Thermostat t1 = new Thermostat(102, "on", "cold");
        d1.displayStatus();
        t1.displayStatus();
    }
}
