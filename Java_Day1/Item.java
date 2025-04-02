public class Item {
    int itemCode;
    String itemName;
    double price;
    Item(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void displayitemdetails(){
        System.out.println("Item Code: " + itemCode + " Name of the Item: " + itemName + " Price: " + price);
    }
    public static void main(String[] args){
        Item item1 = new Item(101 , "Cricket kit" , 2000);
        Item item2 = new Item(102, "Skipping rope", 500);
        item1.displayitemdetails();
        item2.displayitemdetails();
    }

    
}
