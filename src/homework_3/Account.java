package homework_3;

public class Account {
	
	    private String owner;
	    private double balance;

	    
	    public Account(String owner, double balance) {
	        this.owner = owner;
	        this.balance = balance;
	    }


	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }


	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Ошибка: недостаточно средств на счете");
	        }
	    }


	    public double getBalance() {
	        return balance;
	    }
	}

