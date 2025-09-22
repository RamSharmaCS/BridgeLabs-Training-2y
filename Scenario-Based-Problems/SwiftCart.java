interface ICheckout {
    double generateBill();
    void applyDiscount(double coupon);
}

class Product {
    private String name;
    private double price;
    private String category;

    Product(String n, double p, String c) {
        name = n;
        price = p;
        category = c;
    }

    public double getPrice() {
        return price;
    }
}

class PerishableProduct extends Product {
    PerishableProduct(String n, double p) {
        super(n, p, "Perishable");
    }
}

class NonPerishableProduct extends Product {
    NonPerishableProduct(String n, double p) {
        super(n, p, "NonPerishable");
    }
}

class Cart implements ICheckout {
    private Product[] products;
    private double totalPrice;

    Cart(Product[] prods) {
        products = prods;
        totalPrice = 0;
    }

    Cart() {
        products = new Product[0];
        totalPrice = 0;
    }

    public double generateBill() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public void applyDiscount(double coupon) {
        totalPrice -= coupon;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
}
