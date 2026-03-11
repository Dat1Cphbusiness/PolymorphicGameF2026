package simple;

    public class Scorpion implements Creature{
        private String name;
        private int health;

        public Scorpion(String name, int health) {
            this.name = name;
            this.health = health;
        }

        @Override
        public int attack() {
            return 8;
        }

        @Override
        public String meet() {
            return "\uD83E\uDD82 \u001B[31m You encounter a poisonous scorpion raising its tail to strike!\u001B[0m";
        }

        @Override
        public void takeDamage(int damage) {
            health = health - damage;
        }

        @Override
        public int getHealth() {
            return health;
        }

        @Override
        public String getName() {
            return name;
        }

        public int poisonAttack(){
            System.out.println("\u001B Poison spreads though your veins! \u001B[0m");
            return 15;
        }
    }
