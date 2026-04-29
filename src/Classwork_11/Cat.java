package Classwork_11;

public class Cat {


	String name;
    String color;
    int age;

    public Cat(String name, String color, int age) {
        this.name  = name;
        this.color = color;
        this.age   = age;
    }

    public void meow() {
        System.out.println("my name is " + name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("poly", "black", 3);
        cat.meow();
    }
}
