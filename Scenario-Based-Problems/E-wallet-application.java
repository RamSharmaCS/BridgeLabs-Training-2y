interface Transferrable {
    void transferTo(User receiver, double amount);
}

class User {
    private String username;

    User(String u) {
        username = u;
    }

    public String getUsername() {
        return username;
    }
}

class Wallet implements Transferrable {
    private User owner;
    private double balance;

    Wallet(User u, double b) {
        owner = u;
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void transferTo(User receiver, double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
}

class Transaction {
    private Wallet sender;
    private Wallet receiver;
    private double amount;

    Transaction(Wallet s, Wallet r, double a) {
        sender = s;
        receiver = r;
        amount = a;
    }
}
