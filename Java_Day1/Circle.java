public class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void CalculateArea(double radius){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle:" + area);
    }
    void CalculateCircumference(double radius){
        double Circumference = 2 * 3.14 * radius;
        System.out.print("Circumference of Circle:" + Circumference);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(20);
        c1.CalculateArea(20);
        c1.CalculateCircumference(20);

    }
    
}
