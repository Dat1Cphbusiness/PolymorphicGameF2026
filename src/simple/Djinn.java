package simple;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Djinn implements Creature{

    String name;
    int health;
    Scanner input = new Scanner(System.in);

    Djinn(String name){
        this.name = name;
        this.health = 25;
    }


    @Override
    public int attack() {
        Random randomValue = new Random();
        return randomValue.nextInt(1, 11);
    }

    @Override
    public String meet() {
        return "You happen upon a small golden lamp, and decide to rub it. \n An angry D'jinn appears!";
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("For slaying the djinn you get 1 wish");
            System.out.println("1. Become immortal");
            System.out.println("2. Become permanently stronger");
            System.out.println("3. Gain infinite riches");
            System.out.println("4. Deny wish");

            String djinnChoise = input.nextLine();
            switch (djinnChoise) {

                case "1":
                    System.out.println("You will now never die of old age! Congratulations!");
                    break;

                case "2":
                    System.out.println("Your willpower has become a bit stronger!");
                    break;

                case "3":
                    System.out.println("You have infinite money, there is no currency in this world however");
                    break;

                case "4":
                    System.out.println("Coward");
                    break;

            }
            System.out.println();
        }
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
