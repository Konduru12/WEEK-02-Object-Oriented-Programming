class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA(){
        return CGPA;
    }
    public void setCGPA(double CGPA){
        if(CGPA>=0 && CGPA<=10){
            this.CGPA = CGPA;
        }else{
            System.out.println("Invalid CGPA");
        }
    }
    void displayStudentDetails(){
        System.out.println("Roll Number:" + rollNumber);
        System.out.println("Name of the Student: " + name);
        System.out.println("The CGPA: " + getCGPA());
    }}

    class PostgraduateStudent extends Student{
        String branch;
        PostgraduateStudent(int rollNumber, String name, double CGPA, String branch){
            super(rollNumber, name, CGPA);
            this.branch = branch;
        }
        @Override
        public void displayStudentDetails(){
            super.displayStudentDetails();
            System.out.println("Branch: " + branch);
        }
    }
    class Main{
    public static void main(String[] args){
        Student s1 = new Student(12, "Abhi", 9.5);
        s1.displayStudentDetails();
        s1.setCGPA(9.8);
        System.out.println("The Updated CGPA:" + s1.getCGPA());
        PostgraduateStudent p1 = new PostgraduateStudent(10, "Sasanka", 7.9, "AIML");
        p1.displayStudentDetails();
    }
    }
