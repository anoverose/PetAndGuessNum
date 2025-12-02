//Aidana Mamasharipova IEMIT-25
package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Animal {
    static int hunger = 30;
    static int energy = 70;
    static int mood = 60;
     static void main(String[] args) {
        start();
    }
    static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> game = new ArrayList<>();
        System.out.println("--------- Your animal ---------");
        System.out.println("⊹ ₊  ⁺‧₊˚ ♡ ପ(๑•ᴗ•๑)ଓ ♡˚₊‧⁺ ₊ ⊹");
        System.out.println("Enter the name of your animal: ");
        String name = sc.nextLine();
        game.add(name);
        System.out.println("Your animal " + name + " is created!");
        boolean alive = true;
        while (alive) {
            System.out.println("----- Status -----");
            System.out.println("Name: " + name);
            System.out.println("Hunger: " + hunger);
            System.out.println("Energy: " + energy);
            System.out.println("Mood: " + mood);
            System.out.println("------------------");

            System.out.println("Select an action:");
            System.out.println("1 — Feed 😊");
            System.out.println("2 — Play ⚽️");
            System.out.println("3 — Go to bed 🛌");
            System.out.println("4 — Not do anything 🐱");
            System.out.println("5 — Exit 🚪");
            System.out.print("Your choice: ");
            String action = sc.nextLine();
            game.add(action);
            switch (action) {
                case "1":
                    hunger -= 20;
                    mood += 5;
                    System.out.println(name + " ate 🍗");
                    break;
                case "2":
                    mood += 20;
                    hunger += 10;
                    energy -= 15;
                    System.out.println("You played with " + name + " ⚽️");
                    break;
                case "3":
                    energy += 25;
                    hunger += 10;
                    System.out.println(name + " slept 😴");
                    break;
                case "4":
                    hunger += 5;
                    mood -= 5;
                    System.out.println(name + " is doing nothing 🐱");
                    break;

                case "5":
                    System.out.println("Exiting the game...");
                    return;
                default:
                    System.out.println("Incorrect input!");
                    continue;
            }
            hunger += 3;
            mood -= 2;
            energy -= 1;
            hunger = Math.max(0, Math.min(100, hunger));
            mood = Math.max(0, Math.min(100, mood));
            energy = Math.max(0, Math.min(100, energy));
            if (hunger >= 100 || energy <= 0 || mood <= 0) {
                System.out.println(" Your pet " + name + " died...");
                alive = false;
            }
        }
        System.out.println("Game Over.");
    }
}
