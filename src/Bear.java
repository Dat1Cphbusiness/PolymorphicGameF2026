import simple.Creature;

import java.util.Random;

public class Bear implements Creature {
    private String name;//
    private int health;
    private boolean isBig;

public Bear(String name) {
    this.name = name;
    this.health = health;
    Random r = new Random();
    if (r.nextInt() % 2 == 0) {
        isBig = true;
    } else {
        isBig = false;
    }
}

    @Override
    public int attack(){
    if (isBig){
        return 8;
    } else {
        return 4;
      }
    }

    public void takeDamage(int damage){
    health-=damage;
    }

    public int getHealth(){
    return health;
    }



    public String getName(){
    return this.name;
    }

    public String meet(){
    if (isBig) {
        return "a giant Bear is emerging";
    } else {
        return "a small bear is emerging";
    }
    }


}
