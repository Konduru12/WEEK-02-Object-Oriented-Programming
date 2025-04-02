import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
abstract class Product{
    int productId;
    String name;
    double price;
    Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public abstract double calculateDiscount();
    public int getproductid(){
        return productId;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price = price;
    }
    public void displaydetails(){
        System.out.println("Product Id: " + productId);
        System.out.println("Product name: " + name);
        System.out.println("Product Price: "  + price);
    }
}
    interface taxable{
        double calculateTax();
        String getTaxDetails();
    }
    class Electronics extends Product implements taxable{
        Electronics(int productId, String name, double price){
            super(productId, name, price);
        }
        public double calculateDiscount(){
            return price * 0.10;
        }
        public double calculateTax(){
            return price * 0.15;
        }
        public String getTaxDetails(){
            return "Electronic tax : 15%";
        }
    }
    class Clothing extends Product implements taxable{
        Clothing(int productId, String name, double price){
            super(productId, name, price);
        }
        public double calculateDiscount(){
            return price * 0.20;
        }
        public double calculateTax(){
            return price * 0.05;
        }
        public String getTaxDetails(){
            return "Clothing Discount: 5%";
        }
    }
    class Groceries extends Product implements taxable{
        Groceries(int productId, String name, double price){
            super(productId, name, price);
        }
        public double calculateDiscount(){
            return price * 0.30;
        }
        public double calculateTax(){
            return price * 0.10;
        }
        public String getTaxDetails(){
            return "Groceries Discount: 10%";
        }
    }
    public class EcommerencePlatform{
        public static void main(String[] args){
            Electronics e1 = new Electronics(12345, "Fan", 500);
            Clothing c1 = new Clothing(12, "Frock", 2000);
            Groceries g1 = new Groceries(198, "Carrot", 250);
            e1.calculateDiscount();
            e1.calculateTax();
            e1.getTaxDetails();
            e1.displaydetails();
            c1.calculateDiscount();
            c1.calculateTax();
            c1.getTaxDetails();
            c1.displaydetails();
            g1.calculateDiscount();
            g1.calculateTax();
            g1.getTaxDetails();
            g1.displaydetails();
        }
    }
