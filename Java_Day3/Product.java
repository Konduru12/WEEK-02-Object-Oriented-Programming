public class Product {
    static int discount = 40;
    final int productId;
    String productName;
    int price;
    int quantity;
    Product(int productId, String productName, int price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    void displayProductDetails(){
        System.out.println("Enter the Product ID:"+ productId);
        System.out.println("Enter the Product name:"+ productName);
        System.out.println("Enter the Product price:"+ price);
        System.out.println("Enter the Product quantity:" + quantity);
        System.out.println("Enter the discount:" + discount);
    }
    public static void main(String[] args){
        Product p1 = new Product(123, "Orange", 200, 3);
        Product p2 = new Product(908, "Water bottle" , 20, 10);
        if(p1 instanceof Product){
            System.out.println("p1 is an instance of Product");
        }else{
            System.out.println("p1 is not an instance of Product");
        }
        p1.displayProductDetails();
        if(p2 instanceof Product){
            System.out.println("p2 is an instance of Product");
        }else{
            System.out.println("p2 is not an instance of Product");
        }
        p2.displayProductDetails();
    }

}
