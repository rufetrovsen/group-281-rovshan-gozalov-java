package homework_2;

public class Employee {

	    double salary;

	    Employee(double salary) {
	        this.salary = salary;
	    }

	    double calculateBonus() {
	        return salary * 0.10;
	    }
	}

	class Manager extends Employee {

	    Manager(double salary) {
	        super(salary);
	    }
	    
	    
	    double calculateBonus() {
	        return super.calculateBonus() * 1.5;
	    }
	}


