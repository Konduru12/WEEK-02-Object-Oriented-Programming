class Order{
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    void getOrderStatus(){
        System.out.println("Order placed Successfully...");
    }
    void displayOrderinfo(){
        System.out.println("Enter the Order ID:" + orderId);
        System.out.println("Enter the Order Date:"+ orderDate);
    }
}
class ShippedOrder extends Order{
    int trackingNumber;
    ShippedOrder(int orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    void getOrderStatus(){
        System.out.println("Order Shipped Successfully...");
    }
    void displayOrderinfo(){
        super.displayOrderinfo();
        System.out.println("Tracking Number:" + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(int orderId,String orderDate, int trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    void getOrderStatus(){
        System.out.println("Order Delivered Successfully...");
    }
    void displayOrderinfo(){
        super.displayOrderinfo();
        System.out.println("Delivery Date:" + deliveryDate);
    }
    
}
public class Onlineretailmanagement {
    public static void main(String[] args){
        Order o1 = new Order(101, "20/09/2024");
        ShippedOrder s1 = new ShippedOrder(102, "21/09/2023", 2134);
        DeliveredOrder d1 = new DeliveredOrder(120, "31/08/2024", 23419, "03/09/2024");
        
        o1.displayOrderinfo();
        o1.getOrderStatus();
        
        s1.displayOrderinfo();
        s1.getOrderStatus();
        
        d1.displayOrderinfo();
        d1.getOrderStatus();
        
    }
}
