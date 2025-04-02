public class Patient {
    static String hospitalName = "Apolo";
    String name;
    int age;
    String ailment;
    final int patientId;
    static int totalPatients = 0; 
    Patient(String name, int age, String ailment, int patientId){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatients++;
    }
    static int getTotalPatient(){
        return totalPatients;
    }
    void displayPatientDetails(){
        System.out.println("Enter the Hospital name: " + hospitalName);
        System.out.println("Enter the Patient Id: " + patientId);
        System.out.println("Enter the Patient name: " + name);
        System.out.println("Enter the Patient age: "  + age);
        System.out.println("Enter the Patient ailment:" + ailment);
        System.out.println("Total Patients:" + totalPatients);
    }
    public static void main(String[] args){
        Patient p1  = new Patient("Bharath" , 21, "Haedache" , 1002);
        Patient p2 = new Patient("Sasanka" , 20, "Land pain", 102);
        if(p1 instanceof Patient){
            System.out.println("p1 is an instance of Patient");
        }else{
            System.out.println("p1 is not an instance of Patient");
        }
        Patient.getTotalPatient();
        p1.displayPatientDetails();
        if(p1 instanceof Patient){
            System.out.println("p2 is an instance of Patient");
        }else{
            System.out.println("p2 is not an instance of Patient");
        }
        p2.displayPatientDetails();
    }
}
