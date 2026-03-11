package simple;

public class Gargamel implements Creature {
    private String name;
    private int health;

    public Gargamel(String name, int health){
        this.name = name;
        this.health = 100;
    }

    public String getName(){
        return name;
    }

    @Override
    public int attack(){
        if(health == 100){
            return 5;
        } else {
            return 3;
        }
    }

    @Override
    public String meet(){
        return "And suddenly you meet Gargamel";
    }

   @Override
   public int takeDamage(int damage){
        return health -= damage;
   }

   @Override
    public int getHealth(){
        int oldHealth = health;
        if(health <= 0){
            oldHealth += 35;
        }
        return oldHealth;
   }





}


