package simple;

public class FireMaster implements Creature {

    String name;
    int health;

    FireMaster(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    @Override
    public int attack(){
        return 9;
    }

    public void takeDamage(int damage){
        health-=damage;
    }
    @Override
    public String meet() {
        return "Flies from the volcano with fire overall";
    }

}
