package homework_4;

public class Car {
	
	    String model;
	    int year;

	    Car(String model, int year) {
	        this.model = model;
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return "Car model: " + model + ", year: " + year;
	    }

	    public static void main(String[] args) {
	        Car car = new Car("Toyota", 2022);
	        System.out.println(car);
	    }
	}

