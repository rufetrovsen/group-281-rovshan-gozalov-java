package Classwork_11;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("popolnino balans: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" DENEG NET!");
        } else {
            balance -= amount;
            System.out.println("VZAL BALANS " + balance);
        }
    }

    public double getBalance() { return balance; }

    public static void main(String[] args) {
        Bank acc = new Bank(1000.0);
        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.withdraw(5000.0);
    }
}