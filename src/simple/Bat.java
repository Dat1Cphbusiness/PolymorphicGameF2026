package simple;

import java.util.Random;

public class Bat implements Creature {
    private String name;
    private int health;
    private boolean isNight;

    public Bat(String name) {
        this.name = name;
        this.health = 10;
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            isNight = true;
        } else {
            isNight = false;
        }
    }

    @Override
    public int attack() {

        if (isNight)
            return 3;
        else
            return 1;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        if (isNight)
            health -= damage;
        else
            health -= (damage + 1);
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String meet() {
        if (isNight)
            return "a giant bat flies up to you in the dark";
        else
            return "a giant bat flies from thee depth of the cave";
    }
}
