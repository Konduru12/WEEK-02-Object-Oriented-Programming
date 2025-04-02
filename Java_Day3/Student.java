public class Student {
    static String universityName = "SRMIST";
    String name;
    final int rollNumber;
    double Grade;
    Student(String name, int rollNumber, double Grade){
        this.name = name;
        this.rollNumber= rollNumber;
        this.Grade = Grade;
    }
    void displayStudentDetails(){
        System.out.println("Enter the University name:" + universityName);
        System.out.println("Enter the Student name: " + name);
        System.out.println("Enter the Student Roll number:" + rollNumber);
        System.out.println("Enter the Student Grade:" + Grade);
    }
    public static void main(String[] args){
        Student s1 = new Student("Abhinaya", 200 , 9.8);
        Student s2 = new Student("Sasanka", 201, 9.8);
        Student s3 = new Student("Shasank", 203, 9.7);
        if(s1 instanceof Student){
            System.out.println("s1 is an instance of Student");
        }else{
            System.out.println("s1 is not an instance of Student");
        }
        s1.displayStudentDetails();
        if(s2 instanceof Student){
            System.out.println("s2 is an instance of Student");
        }else{
            System.out.println("s2 is not an instance of Student");
        }
        s2.displayStudentDetails();
        if(s3 instanceof Student){
            System.out.println("s3 is an instance of Student");
        }else{
            System.out.println("s3 is not an instance of Student");
        }
        s3.displayStudentDetails();
    }
}
