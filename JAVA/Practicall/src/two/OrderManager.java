import.java.util.ArrayList;
import.java.util.List;
        
        public class OrderManager {

    public static void main(String[] args) {

        // 1. Create ArrayList and add 5 orders
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(101, "2025-06-25", "Alice", "Laptop", 55000.0, "New Delhi"));
        orderList.add(new Order(102, "2025-06-26", "Bob", "Mobile", 25000.0, "Mumbai"));
        orderList.add(new Order(103, "2025-06-27", "Charlie", "Tablet", 15000.0, "Bangalore"));
        orderList.add(new Order(104, "2025-06-28", "David", "Monitor", 12000.0, "Chennai"));
        orderList.add(new Order(105, "2025-06-29", "Eva", "Keyboard", 2000.0, "Kolkata"));

        // 2. Display all added orders
        System.out.println("All Orders:");
        for (Order order : orderList) {
            System.out.println(order);
        }

        // 3. Remove an order by order number (e.g. 103)
        int orderNoToRemove = 103;
        orderList.removeIf(order -> order.orderNo == orderNoToRemove);
        System.out.println("\nAfter removing order number " + orderNoToRemove + ":");
        for (Order order : orderList) {
            System.out.println(order);
        }

        // 4. Make a copy of the ArrayList
        List<Order> copiedList = new ArrayList<>(orderList);
        System.out.println("\nCopied List:");
        for (Order order : copiedList) {
            System.out.println(order);
        }

        // 5. Remove all orders from the copied list
        copiedList.clear();
        System.out.println("\nCopied List after removing all orders:");
        System.out.println(copiedList);  // Will be empty
    }
}