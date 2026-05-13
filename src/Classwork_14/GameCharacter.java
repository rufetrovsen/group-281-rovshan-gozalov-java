package Classwork_14;

public class GameCharacter {
    String name;
    int health;
    int level;


    public GameCharacter(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
    }


    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }


    public void heal(int amount) {
        health = Math.min(100, health + amount);
    }


    public boolean isAlive() {
        return health > 0;
    }


    public void levelUp() {
        level++;
    }
}