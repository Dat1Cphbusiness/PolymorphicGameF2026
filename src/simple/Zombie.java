package simple;

public class Zombie implements Creature {

    int health;
    String name;

    public Zombie(String name) {
        this.health = 12;
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
        return "\uD83E\uDDDF\u200D♂\uFE0F\u001B[32mThrough the trees a vengeful zombie appears - ready to eat your brain \u001B[0m\uD83E\uDDDF\u200D♂\uFE0F";
    }
}

