
    class Employee{
        String name;
        int id;
        int salary;
        Employee(String name,int id,int salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        void displayDetails(){
            System.out.println("Name: " + name);
            System.out.println("Employee ID:" + id);
            System.out.println("Salary:" + salary);
        }
    }
class Manager extends Employee{
        int teamSize;
        Manager(String name, int id, int salary,int teamSize){
            super(name, id, salary);
            this.teamSize = teamSize;
        }
        void displayDetails(){
            System.out.println("Team size:" + teamSize);
            super.displayDetails();
        }
 }
    
    class Developer extends Employee{
        String programmingLanguage;
        Developer(String name,int id,int salary, String programmingLanguage){
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }
        void displayDetails(){
            System.out.println("Programming Language known:" + programmingLanguage);
            super.displayDetails();
        }
    }
    class Intern extends Employee{
        Intern(String name, int id, int salary){
            super(name, id, salary);
        }
        void displayDetails(){
            super.displayDetails();
        }
    }
    public class EmployeeManagementSystem {
    public static void main(String[] args){
        Developer d1 = new Developer("Abhinaya", 101, 10000000,"Java");
        Manager m1 = new Manager("Bharath", 102, 50000,20);
        Intern i1 = new Intern("Shasank",103,25000);
        d1.displayDetails();
        m1.displayDetails();
        i1.displayDetails();
    }
}
