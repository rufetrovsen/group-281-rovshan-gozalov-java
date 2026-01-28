package homework_2;

public class Character {
	    String name;
	    int health;
	    int strength;

	    Character(String name, int health, int strength) {
	        this.name = name;
	        this.health = health;
	        this.strength = strength;
	    }

	    Character heal(int value) {
	        health += value;
	        return this;
	    }

	    Character train() {
	        strength++;
	        return this;
	    }

	    void printStats() {
	        System.out.println("Name: " + name);
	        System.out.println("Health: " + health);
	        System.out.println("Strength: " + strength);
	    }
	}


