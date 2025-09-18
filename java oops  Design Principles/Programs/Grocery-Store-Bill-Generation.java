import java.util.*;

class Product {
    private String name;
    private double qty;
    private double pricePerUnit;
    public Product(String name, double qty, double pricePerUnit){
        this.name = name; this.qty = qty; this.pricePerUnit = pricePerUnit;
    }
    public double totalPrice(){ return qty * pricePerUnit; }
    public String getName(){ return name; }
    public double getQty(){ return qty; }
    public double getPricePerUnit(){ return pricePerUnit; }
}

class Customer {
    private int id;
    private String name;
    public Customer(int id, String name){ this.id = id; this.name = name; }
    public String getName(){ return name; }
    public int getId(){ return id; }
}

class Order {
    private Customer customer;
    private List<Product> products = new ArrayList<>();
    public Order(Customer c){ this.customer = c; }
    public void addProduct(Product p){ products.add(p); }
    public double computeTotal(){
        return products.stream().mapToDouble(Product::totalPrice).sum();
    }
    public void printBill(){
        System.out.println("Bill for: " + customer.getName());
        for(Product p: products){
            System.out.printf("%s - qty: %.2f price/unit: %.2f total: %.2f%n",
                              p.getName(), p.getQty(), p.getPricePerUnit(), p.totalPrice());
        }
        System.out.printf("TOTAL: %.2f%n", computeTotal());
    }
}

public class GroceryBill {
    public static void main(String[] args){
        Customer alice = new Customer(1, "Alice");
        Order order = new Order(alice);
        order.addProduct(new Product("Apples", 2.0, 3.0));
        order.addProduct(new Product("Milk", 1.0, 2.0));
        order.printBill();
    }
}
