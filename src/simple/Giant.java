package simple;

import java.util.Random;

public class Giant implements Creature{
    private String name;
    private int health;

    public Giant(String name){
        this.health = 75;
        this.name = name;
    }

    @Override
    public int attack(){
        Random random = new Random();
        int chance = random.nextInt(100);

        if(chance == 0){
            System.out.println("The giant lands a massive hit");
            return 100;
        }else{
            System.out.println("The giant misses but you still take 1 damage from the rebound of the giants hit");
            return 1;
        }
    }

    public String meet(){
        return "from behind the mountain a shadow emerges, the giant steps forward";
    }

    @Override
    public void takeDamage(int damage){
        health -= damage;

    }

    public int getHealth(){
        return health;
    }

    public String getName(){
        return this.name;
    }
}
