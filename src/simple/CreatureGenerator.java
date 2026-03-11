package simple;

import java.util.ArrayList;
import java.util.Random;


public class CreatureGenerator {

    private ArrayList<Creature> creatures = new ArrayList<>();

    public CreatureGenerator(){
        generateCreatures();
    }

    public void generateCreatures() {

      /*  creatures.add(new Giant("Ymir"));
        creatures.add(new Djinn("Djinnie"));
        creatures.add(new FireMaster("Fireman", 100));
        creatures.add(new Gargamel("Gargamel", 100));
        creatures.add(new Golem("Big John"));
        creatures.add(new Scorpion("Black Scorpion", 100));
        creatures.add(new Slime("Slop Bob"));
        creatures.add(new Snake("Jackie"));
        creatures.add(new Wolf("Night Wolf"));
        creatures.add(new Bat("Batman"));
        creatures.add(new Zombie("Jens"));*/
        creatures.add(new Bear("Bear Guy"));
    }

    public Creature getRandomCreature() {
        Random r = new Random();
        int i = r.nextInt(creatures.size());
        return creatures.remove(i);
    }
}
