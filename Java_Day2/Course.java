public class Course{
    String courseName;
    int duration;
    int fee;
    static String institutionName = "SRM" ; 
    Course(String courseName, int duration, int fee, String intitutionName){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    static void modifyname(String newname){
        institutionName = newname;
    }
    void displaycoursedetails(){
        System.out.println("CourseName: " + courseName + " duration: " + duration + " fee of the Course: " + fee + " Institution: " + institutionName);
        
    }
    public static void main(String[] args){
        Course c1 = new Course("Java bootcamp" , 2, 30000, "GateSmashers");
        Course c2 = new Course("Python Crash course", 3, 50000, "Coursera");
        c1.displaycoursedetails();
        Course.modifyname("VIT");
        c2.displaycoursedetails();
        
    }
    }
