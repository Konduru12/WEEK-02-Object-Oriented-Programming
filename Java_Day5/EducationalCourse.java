class Course{
    String courseName;
    int duration;
    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayEducDetails(){
        System.out.println("Name of the Course:" + courseName);
        System.out.println("Duration of the Course:" + duration);
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void displayEducDetails(){
        super.displayEducDetails();
        System.out.println("Course Platform Name:" + platform);
        System.out.println("Is classes are recorded?" + isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    float discount;
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, float discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    void displayEducDetails(){
        super.displayEducDetails();
        System.out.println("Course Fee:" + fee);
        System.out.println("Discount offered for the course:" + discount);
    }
}
public class EducationalCourse {
    public static void main(String[] args){
        Course c1 = new Course("Crash course of Python", 2);
        OnlineCourse o1 = new OnlineCourse("SQL for datascience", 3, "Coursera", false);
        PaidOnlineCourse p1 = new PaidOnlineCourse("Tableau", 2, "Coursera", true, 1200, 20);
        c1.displayEducDetails();
        o1.displayEducDetails();
        p1.displayEducDetails();
    }
}
