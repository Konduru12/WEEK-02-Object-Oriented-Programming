public class Employee {
    static String companyName = "Capgemini";
    String name;
    final int id;
    String designation;
    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    void displayEmployeeDetails(){
        System.out.println("Enter the Company name:" + companyName);
        System.out.println("Enter the Employee name:" + name);
        System.out.println("Enter the Employee ID:" + id);
        System.out.println("Enter the Employee designation:"+ designation);
    }
    public static void main(String[] args){
        Employee e1 = new Employee("Abhinaya", 120, "Analyst");
        Employee e2 = new Employee("Sasanka", 234, "SDE");
        Employee e3 = new Employee("Shasank", 2345, "Data Science intern");
        if(e1 instanceof Employee){
            System.out.println("e1 is instance of Book");
            e1.displayEmployeeDetails();
        }else{
            System.out.println("e1 is not instance of Book");
        }
        if(e2 instanceof Employee){
            System.out.println("e2 is instance of Book");
            e2.displayEmployeeDetails();
        }else{
            System.out.println("e2 is not instance of Book");
        }
        if(e3 instanceof Employee){
            System.out.println("e3 is instance of Book");
            e3.displayEmployeeDetails();
        }else{
            System.out.println("e3 is not instance of Book");
        }
    }
}
