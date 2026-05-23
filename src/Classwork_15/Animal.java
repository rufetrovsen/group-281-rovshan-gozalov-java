package Classwork_15;
 public class Animal {
    String name;
    String sound;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.name = "kotost";
        cat.sound = "mau";

        Animal dog = new Animal();
        dog.name = "Sobaka";
        dog.sound = "gav gav";

        Animal parrot = new Animal();
        parrot.name = "papugay";
        parrot.sound = "kar";

        System.out.println(cat.name + " говорит: " + cat.sound);
        System.out.println(dog.name + " говорит: " + dog.sound);
        System.out.println(parrot.name + " говорит: " + parrot.sound);
     }
 }
}