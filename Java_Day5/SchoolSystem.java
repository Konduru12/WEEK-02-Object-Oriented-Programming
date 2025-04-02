class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayRole(){
        System.out.println("I am person");
    }
    void displayPersondetails(){
        System.out.println("Name of the person:" + name);
        System.out.println("Age of the person:" + age);
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    void displayRole(){
        System.out.println("I am a Teacher");
    }
    void displayPersondetails(){
        super.displayPersondetails();
        System.out.println("Name of the Subject:"  + subject);
    }
}
class Student extends Person{
    int Grade;
    Student(String name, int age, int Grade){
        super(name, age);
        this.Grade = Grade;
    }
    void displayRole(){
        System.out.println("I am a Student");
    }
    void displayPersondetails(){
        super.displayPersondetails();
        System.out.println("Grade of the student:" + Grade);
    }
}
class Staff extends Person{
    Staff(String name ,int age){
        super(name, age);
    }
    void displayRole(){
        System.out.println("I am a Staff");
    }
    void displayPersondetails(){
        super.displayPersondetails();
        System.out.println("I am a staff in this institution");
    }
}
public class SchoolSystem {
    public static void main(String[] args){
        Person p1 = new Person("Abhinaya", 21);
        Teacher t1 = new Teacher("Srinivas" , 35,"Physics");
        Student s1 = new Student("Chintu", 19, 9);
        Staff s2 = new Staff("Lakshmi", 39);
        p1.displayPersondetails();
        p1.displayRole();
        t1.displayPersondetails();
        t1.displayRole();
        s1.displayPersondetails();
        s1.displayRole();
        s2.displayPersondetails();
        s2.displayRole();
    }
}
