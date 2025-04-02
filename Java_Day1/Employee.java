public class Employee {
    String name;
    int Id;
    int Salary;
    Employee(String name, int Id,int Salary){
        this.name = name;
        this.Id = Id;
        this.Salary = Salary;
    }
    void displayDetails(){
        System.out.println("Name: " + name + " ID: " + Id + " Salary: " + Salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("Sasanka", 100,100000);
        Employee e2 = new Employee("Bharath", 101, 20000);
        e1.displayDetails();
        e2.displayDetails();
    }
}
