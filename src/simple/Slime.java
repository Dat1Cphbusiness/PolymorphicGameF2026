package simple;

import java.util.Random;

public class Slime implements Creature{

    String name; //Slop Bob
    int health;
    boolean isRaining;

    Slime(String name, int health){
        this.name=name;
        this.health=10;

        Random r = new Random();
        if (r.nextInt() % 4 == 0 || r.nextInt()==99) {
            isRaining = true;
        } //slim bliver styrket af regnvejr, og tager mindre damage.


    }


    @Override
    public int attack() {
        return 2;
    }

    @Override
    public String meet() {
        return name+" slumps along the ground, soaking up all moisture in his way, growing stronger and stronger";
    }

    @Override
    public void takeDamage(int damage) {
        if (isRaining) {
            System.out.println(name+" takes damage, but soaks up the rain and feels more alive than ever");
            health+=damage;
        } else health-=(damage+2);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }
}
