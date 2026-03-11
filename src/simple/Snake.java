package simple;

public class Snake implements Creature {

    int health;
    String name;

    public Snake(String name) {
        this.health = 15;
        this.name = name;
    }

    @Override
    public int attack() {
        return 8;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
        return "from nowhere... the snake comes quietly from the ground pssssss";
    }
}
