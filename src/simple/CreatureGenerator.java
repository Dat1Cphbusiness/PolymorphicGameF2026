package simple;

import java.util.ArrayList;
import java.util.Random;


public class CreatureGenerator {

    private ArrayList<Creature> creatures = new ArrayList<>();

    public CreatureGenerator(){
        generateCreatures();
    }

    public void generateCreatures() {
        creatures.add(new Bat("Kik"));
        creatures.add(new Snake("PoPo"));
        creatures.add(new Bat("Bob"));
        creatures.add(new Snake("Smukki"));
        creatures.add(new Spider("Haji"));
    }

    public Creature getRandomCreature() {
        Random r = new Random();
        int i = r.nextInt(creatures.size());
        return creatures.get(i);
    }
}
