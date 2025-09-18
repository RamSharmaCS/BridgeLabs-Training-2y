import java.util.*;

class Account {
    private String accNo;
    private double balance;
    public Account(String accNo, double initial){ this.accNo=accNo; this.balance=initial; }
    public void deposit(double amt){ balance += amt; }
    public boolean withdraw(double amt){
        if(amt <= balance){ balance -= amt; return true; } return false;
    }
    public double getBalance(){ return balance; }
    public String getAccNo(){ return accNo; }
}

class Customer {
    private int id;
    private String name;
    private List<Account> accounts = new ArrayList<>();
    public Customer(int id, String name){ this.id = id; this.name=name; }
    public void addAccount(Account a){ accounts.add(a); }
    public List<Account> getAccounts(){ return accounts; }
    public void viewBalances(){
        System.out.println("Customer: " + name);
        for(Account a: accounts) System.out.printf("Acc %s -> %.2f%n", a.getAccNo(), a.getBalance());
    }
}

class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();
    public Bank(String name){ this.name=name; }
    public void openAccount(Customer c, Account a){
        c.addAccount(a);
        if(!customers.contains(c)) customers.add(c);
    }
    public void listCustomers(){
        System.out.println("Bank: " + name);
        for(Customer c: customers) System.out.println("Customer: " + c.getAccounts().size() + " accounts");
    }
}

public class BankAccounts {
    public static void main(String[] args){
        Bank bank = new Bank("StateBank");
        Customer c1 = new Customer(1,"Anoop");
        Account a1 = new Account("SB1001", 5000);
        bank.openAccount(c1, a1);
        c1.viewBalances();
    }
}
