interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

class Account implements ITransaction {
    private String accountNumber;
    private double balance;

    Account(String num, double openBal) {
        accountNumber = num;
        balance = openBal;
    }

    Account(String num) {
        accountNumber = num;
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double checkBalance() {
        return balance;
    }

    double calculateInterest(double interestRate) {
        return balance * interestRate / 100;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String num, double openBal) {
        super(num, openBal);
    }

    double calculateInterest(double interestRate) {
        return super.checkBalance() * interestRate / 100 + 20;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String num, double openBal) {
        super(num, openBal);
    }

    double calculateInterest(double interestRate) {
        return super.checkBalance() * interestRate / 100;
    }
}
