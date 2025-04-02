public class MobilePhone {
    String brand;
    String model;
    int price;
    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displaymobiledetails(){
        System.out.println("Brand name:" + brand);
        System.out.println("Model of mobile:" + model);
        System.out.println("Price:" + price);
    }
    public static void main(String[] args){
        MobilePhone m1 = new MobilePhone("Samsung", "s2 promax", 25000);
        MobilePhone m2 = new MobilePhone("Oneplus", " CE 5g nord", 70000);
        m1.displaymobiledetails();
        m2.displaymobiledetails();
    }
}
