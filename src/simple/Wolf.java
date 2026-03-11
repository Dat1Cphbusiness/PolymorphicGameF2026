package simple;

public class Wolf implements Creature {

    int health;
    String name;

    public Wolf(String name) {
        this.name = name;
        this.health = 50;
    }

    @Override
    public int attack() {
        return 20;
    }

    @Override
    public String meet() {
        return "legendary wolf";
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
