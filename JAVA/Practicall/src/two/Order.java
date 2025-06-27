import java.util.ArrayList;
import java.util.List;

class Order {
    int orderNo;
    String orderDate;
    String orderBy;
    String orderItem;
    double totalPrice;
    String orderAddress;

    public Order(int orderNo, String orderDate, String orderBy, String orderItem, double totalPrice, String orderAddress) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderBy = orderBy;
        this.orderItem = orderItem;
        this.totalPrice = totalPrice;
        this.orderAddress = orderAddress;
    }

    public String toString() {
        return "Order No: " + orderNo +
                ", Date: " + orderDate +
                ", Ordered By: " + orderBy +
                ", Item: " + orderItem +
                ", Price: " + totalPrice +
                ", Address: " + orderAddress;
    }
}
