public class ProductInventory {
    String productName;
    int price;
    static int totalProducts;
    ProductInventory(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Product name: "  + productName + " Price: "  + price);
    }
    static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args){
        ProductInventory product1 = new ProductInventory("Chocloate", 200);
        ProductInventory product2 = new ProductInventory("Ice cream", 300);
        product1.displayProductDetails();
        product2.displayProductDetails();
        ProductInventory.displayTotalProducts();
    }
}
