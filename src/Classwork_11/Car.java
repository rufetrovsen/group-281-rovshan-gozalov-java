package Classwork_11;

public class Car {
	String brand, model;
    int year, speed = 0;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year  = year;
    }

    public void accelerate(int kmh) {
        speed = Math.min(speed + kmh, 200);
    }

    public void brake(int kmh) {
        speed = Math.max(speed - kmh, 0);
    }


    @Override
	public String toString() {
        return brand + " " + model + " (" + year + ") → " + speed + " km/ph";
    }

    public static void main(String[] args) {
        Car car = new Car("MASINKA UCITELA", "SAMIY LICSHIY", 2067);
        car.accelerate(67);
        car.accelerate(80);
        System.out.println(car);
    }
}
