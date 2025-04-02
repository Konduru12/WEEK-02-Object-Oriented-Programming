import java.util.*;

class University {
    final private String UniversityName;
    final private List<Department1> departmentList;

    public University(String universityName) {
        this.UniversityName = universityName;
        this.departmentList = new ArrayList<>();
    }

    public void addDepartment(Department1 department) {
        departmentList.add(department);
    }

    public void displayDetails() {
        System.out.println("University name : " + UniversityName);
        System.out.println("Departments :");
        for (Department1 department : departmentList) {
            System.out.println(department.getDepartmentName());
        }
    }
}
class Department1{
        final private String DepartmentName;
        final private List<Faculty> facultyList;

    public Department1(String departmentName) {
        DepartmentName = departmentName;
        this.facultyList=new ArrayList<>();
    }

    public void addFaculty(Faculty faculty){
        facultyList.add(faculty);
    }

    public String getDepartmentName(){
        return DepartmentName;
    }
    public void displayDetails(){
        System.out.println("Department Name : "+DepartmentName);
        System.out.println("Faculties : ");
        for (Faculty faculty:facultyList){
            faculty.displayDetails();
        }
    }
}

class Faculty{
    final private String facultyname;

    public Faculty(String facultyname) {
        this.facultyname = facultyname;
    }

    public void displayDetails(){
        System.out.println("Faculty Name : "+facultyname);
    }
}

public class UniversityDepartments {
    public static void main(String[] args) {
        University SRM= new University("SRM");

        Department1 computers=new Department1("Computer Dept");
        Department1 civil=new Department1("civil Dept");

        Faculty faculty1=new Faculty("Abhinaya");
        Faculty faculty2=new Faculty("Sasanka");

        computers.addFaculty(faculty1);
        computers.addFaculty(faculty2);

        civil.addFaculty(faculty1);

        SRM.addDepartment(civil);
        SRM.addDepartment(computers);

        System.out.println("Faculty Details : ");
        computers.displayDetails();
        System.out.println();
        civil.displayDetails();
        System.out.println();

        System.out.println("University Details : ");
        SRM.displayDetails();
    }
}
