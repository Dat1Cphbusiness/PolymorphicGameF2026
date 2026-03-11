package simple;

public class Dragon implements Creature {

    int health;
    String name;

    public Dragon(String name) {
        this.health = 10;
        this.name = name;
    }

    @Override
    public int attack() {
        return 7;
    }

    public int takeDamage(int damage) {
        health -= damage;
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
        return "from the sky a metallic green dragon comes thundering";
    }
}
