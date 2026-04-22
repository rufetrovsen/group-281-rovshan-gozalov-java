package homework_11;

public class homework_11 {


	// #01
	class Dog {
	    String name;
	    int age;

	    Dog(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void bark() {
	        System.out.println("Woof! I'm " + name);
	    }
	}

	// #02
	class Person {
	    private String name;
	    private int age;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age < 0) {
			}
	        this.age = age;
	    }
	}

	// #03
	static int sumArray(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    return sum;
	}

	// #04
	class Animal {
	    void speak() {}
	}

	class Cat extends Animal {

	    @Override
		void speak() {
	        System.out.println("Meow!");
	    }
	}

	// #05
	for (int i = 1; i <= 10; i++) {
	    for (int j = 1; j <= 10; j++) {
	        System.out.printf("%4d", i * j);
	    }
	    System.out.println();
	}

	// #06
	class BankAccount {
	    String owner;
	    double balance;

	    BankAccount(String owner, double balance) {
	        this.owner = owner;
	        this.balance = balance;
	    }

	    void deposit(double amount) {
	        if (amount > 0) {
				balance += amount;
			}
	    }

	    void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
				balance -= amount;
			}
	    }

	    double getBalance() {
	        return balance;
	    }
	}

	// #07
	static  void fib(int n) {
	    int a = 0, b = 1, count = 0;
	    while (count < n) {
	        System.out.print(a + " ");
	        int next = a + b;
	        a = b;
	        b = next;
	        count++;
	    }
	}

	// #08
	interface Drawable {
	    void draw();
	}

	class Circle implements Drawable {
	    double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
		public void draw() {
	        System.out.println("Circle radius=" + radius);
	    }
	}

	class Rectangle implements Drawable {
	    double width, height;

	    Rectangle(double w, double h) {
	        width = w;
	        height = h;
	    }

	    @Override
		public void draw() {
	        System.out.println("Rectangle " + width + "x" + height);
	    }
	}

	// #09
	static int[] findMinMax(int[] arr) {
	    int min = arr[0], max = arr[0];
	    for (int num : arr) {
	        if (num < min) {
				min = num;
			}
	        if (num > max) {
				max = num;
			}
	    }
	    return new int[]{min, max};
	}

	// #10
	class MathUtils {

	    static int factorial(int n) {
	        if (n <= 1) {
				return 1;
			}
	        return n * factorial(n - 1);
	    }

	    static boolean isPrime(int n) {
	        if (n < 2) {
				return false;
			}
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
					return false;
				}
	        }
	        return true;
	    }
	}

	// #11
	abstract class Shape {
	    abstract double area();
	}

	class Triangle extends Shape {
	    double base, height;

	    Triangle(double b, double h) {
	        base = b;
	        height = h;
	    }

	    @Override
		double area() {
	        return 0.5 * base * height;
	    }
	}

	class Square extends Shape {
	    double side;

	    Square(double s) {
	        side = s;
	    }

	    @Override
		double area() {
	        return side * side;
	    }
	}

	// #12
	static String reverseString(String s) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = s.length() - 1; i >= 0; i--) {
	        sb.append(s.charAt(i));
	    }
	    return sb.toString();
	}

	// #13
	?

	// #14
	static int countVowels(String s) {
	    int count = 0;
	    s = s.toLowerCase();
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
	    }
	    return count;
	}

	// #15




	// #16
	static void bubbleSort(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
			}
		}
	}

	// #17
	class Student {
	    String name;
	    int grade;

	    Student(String name, int grade) {
	        this.name = name;
	        this.grade = grade;
	    }

	    @Override
		public String toString() {
	        return "Student{" + name + ", grade=" + grade + "}";
	    }

	    @Override
		public boolean equals(Object o) {
	        if (this == o) {
				return true;
			}
	        if (!(o instanceof Student)) {
				return false;
			}
	        Student s = (Student) o;
	        return name.equals(s.name);
	    }
	}

	// #18
	?

	// #19
	class AppConfig {
	    private static AppConfig instance;

	    private AppConfig() {}

	    public static AppConfig getInstance() {
	        if (instance == null) {
	            instance = new AppConfig();
	        }
	        return instance;
	    }
	}

	// #20
	?
	        }
	    }
	}

