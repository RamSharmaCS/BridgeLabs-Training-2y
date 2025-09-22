interface IDiscountable {
    void applyDiscount(double discount);
}

class Book implements IDiscountable {
    private String title;
    private String author;
    private double price;
    private int stock;

    Book(String t, String a, double p, int s) {
        title = t;
        author = a;
        price = p;
        stock = s;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void applyDiscount(double discount) {
        price -= discount;
    }
}

class EBook extends Book {
    EBook(String t, String a, double p, int s) {
        super(t, a, p, s);
    }

    public void applyDiscount(double discount) {
        super.applyDiscount(discount * 1.1);
    }
}

class PrintedBook extends Book {
    PrintedBook(String t, String a, double p, int s) {
        super(t, a, p, s);
    }

    public void applyDiscount(double discount) {
        super.applyDiscount(discount);
    }
}

class Order {
    private Book[] books;
    private String userId;

    Order(String uid, Book[] bks) {
        userId = uid;
        books = bks;
    }

    public double totalCost() {
        double cost = 0;
        for (Book b : books) {
            cost += b.getPrice();
        }
        return cost;
    }
}
