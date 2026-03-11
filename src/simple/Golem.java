package simple;

import java.util.Random;

public class Golem implements Creature{
    private String name;
    private int health;

    public Golem(String name) {
        this.name = name;
        this.health = 100;

    }

    @Override
    public int attack(){
        Random rand = new Random();
        int chance = rand.nextInt(5);
        int damage;
        if (chance == 0) {
            damage = 100;
            System.out.println("The Stone Golem stomps on you");
        } else {
            damage = 0;
            System.out.println("The Stone Golem looks at you funny doesn't attack");
        }
        return damage;
    }
    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth(){
        return health;
    }

    public String meet(){
        return "You feel a rumbling in the ground and the GIANT boulder next to you grows legs and arms, the stone Golem appears";
    }

    public String getName(){
        return name;

    }
}