//import java.util.*;
//
//// --- 1. ABSTRACTION & ENCAPSULATION ---
//abstract class User {
//    private String name;
//    private String email;
//
//    public User(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }
//
//    public String getName() { return name; }
//    public abstract void showDashboard(); // Abstract method
//}
//
//// --- 2. INHERITANCE ---
//class Customer extends User {
//    private int custId;
//    private List<Order> orders = new ArrayList<>();
//
//    public Customer(int id, String name, String email) {
//        super(name, email);
//        this.custId = id;
//    }
//
//    @Override
//    public void showDashboard() {
//        System.out.println("\n>> Customer Dashboard: " + getName() + " (ID: " + custId + ")");
//    }
//
//    public void addOrder(Order o) { orders.add(o); }
//}
//
//class Product {
//    private int id;
//    private String name;
//    private double price;
//
//    public Product(int id, String name, double price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//
//    public double getPrice() { return price; }
//    public String getName() { return name; }
//}
//
//class Order {
//    private int orderNo;
//    private List<Product> products;
//    private double totalAmount;
//
//    public Order(int orderNo, List<Product> products) {
//        this.orderNo = orderNo;
//        this.products = products;
//        this.totalAmount = calculateTotal();
//    }
//
//    private double calculateTotal() {
//        return products.stream().mapToDouble(Product::getPrice).sum();
//    }
//
//    public void printReceipt() {
//        System.out.println("Order #" + orderNo + " | Total: $" + totalAmount);
//    }
//}
//
//// --- 3. SERVICE LAYER (Shows design maturity) ---
//class EcommerceService {
//    private Map<Integer, Product> productInventory = new HashMap<>();
//    private int orderCounter = 9000;
//
//    public void addProduct(Product p) {
//        productInventory.put(p.hashCode(), p);
//    }
//
//    public Order placeOrder(Customer c, List<Product> items) {
//        Order newOrder = new Order(++orderCounter, items);
//        c.addOrder(newOrder);
//        return newOrder;
//    }
//}
//
//// --- 4. RUNNABLE MAIN (The Simulation) ---
//public class RocketCodingRound {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        EcommerceService service = new EcommerceService();
//
//        // Mock Data
//        Product laptop = new Product(101, "Dell XPS", 1200.00);
//        Product mouse = new Product(102, "Magic Mouse", 80.00);
//        service.addProduct(laptop);
//        service.addProduct(mouse);
//
//        System.out.println("=== ROCKET INDIA E-COMMERCE SYSTEM ===");
//
//        // Input Section
//        System.out.print("Enter Customer Name: ");
//        String name = sc.nextLine();
//        Customer customer = new Customer(1, name, name.toLowerCase() + "@rocket.com");
//
//        customer.showDashboard();
//
//        // POLYMORPHISM in action
//        List<Product> cart = new ArrayList<>();
//        System.out.println("1. " + laptop.getName() + " ($1200)");
//        System.out.println("2. " + mouse.getName() + " ($80)");
//
//        System.out.print("Enter product ID to buy (1 or 2): ");
//        int choice = sc.nextInt();
//
//        if(choice == 1) cart.add(laptop);
//        else cart.add(mouse);
//
//        // Process Order
//        Order myOrder = service.placeOrder(customer, cart);
//
//        System.out.println("\n--- Processing Payment ---");
//        myOrder.printReceipt();
//        System.out.println("Status: Shipped via Rocket Express");
//
//        sc.close();
//    }
//}