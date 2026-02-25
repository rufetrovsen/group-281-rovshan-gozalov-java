package homework_8;

public class runner {
  public static void main(String[] args) {
	  car c_1 = new car("BMW") ;
	  System.out.println("Car name :"+ c_1.name);
	  c_1.drive();

	  bus b_1  new  bus("Hundai");

	  System.out.println("Bus name :"+ b_1.name);
	  b_1.stop();

	  plane p_1 = new plane("qatar");

	  System.out.println("Plane name :"+ p_1.name);
      p_1.fly();

  }
}
