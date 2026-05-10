package Classwork_11;

public class Calculator {


	public int    add(int a, int b)  {
		return a + b;
		}
    public double add(double a, double b) {
    	return a + b;
    	}
    public int    add(int a, int b, int c) {
    	return a + b + c;
    	}

    public int    multiply(int a, int b) {
    	return a * b;
    	}
    public double multiply(double a, double b) {
    	return a * b;
    	}

    public int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
			result *= base;
		}
        return result;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(1.5, 2.5));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.power(2, 10));
    }
}
