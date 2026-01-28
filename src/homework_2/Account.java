package homework_2;

public class Account {
    String owner;
    double balance;
    
    public Account( String owner, double balance) {
    	this.owner = owner;
    	this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

