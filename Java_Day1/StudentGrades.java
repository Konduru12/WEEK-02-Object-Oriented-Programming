public class StudentGrades {
    String name;
    int Rollno;
    double marks;
    StudentGrades(String name, int Rollno, double marks){
        this.name = name;
        this.Rollno = Rollno;
        this.marks = marks;
    }
    static String Gardes(double marks){
        if(marks > 80){
            return "O+";
        }else if(marks > 70){
            return "A+";
        }else if(marks > 60){
            return "B+";
        }else if(marks > 50){
            return "C+";
        }else{
            return "F";
        }
    }
    void displayStudentDetails(){
        System.out.println("Name: " + name + " Rollno: " + Rollno + " Marks: " + marks+" Grades: " + Gardes(marks));
    }
    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Abhinaya" , 100, 100);
        StudentGrades s2 = new StudentGrades("Sasanka", 101, 90);
        StudentGrades s3 = new StudentGrades("Bharath", 103, 20);
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();

    }
}
