package simple;

public class Spider implements Creature {

    int health;
    String name;

    public Spider(String name) {
        this.health = 10;
        this.name = name;
    }

    @Override
    public int attack() {
        return 6;
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
        return "from above the sky a giant spider comes crowling from its net";
    }
}





