public class Circle {
    double radius;
    Circle(){
        radius = 10.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    void CalculateArea(double radius){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle:" + area);
    }
    void CalculateCircumference(double radius){
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
    public static void main(String[] args){
        Circle c1 = new Circle(20);
        c1.CalculateArea(20);
        c1.CalculateCircumference(20);
    }
}
