package homework_2;

public class Car {
	
	    Engine engine;
	    String model;

	    public Car(String model, Engine engine) {
	        this.model = model;
	        this.engine = engine;
	    }

	    public void printDetails() {
	        System.out.println(model);
	        System.out.println(engine.horsepower);
	    }
	}

