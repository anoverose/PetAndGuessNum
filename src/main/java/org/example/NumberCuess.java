package org.example;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class NumberGuess {
     static void main(String[] args) {
        Game();
    }
    static void Game () {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> text = new ArrayList<>();
        System.out.println("Welcome to the game < Guess the number >!");
        System.out.println("Select difficulty level:");
        System.out.println("1 - Easy   (1–50)");
        System.out.println("2 - Medium (1–100)");
        System.out.println("3 - Hard   (1–500)");
        System.out.println("Enter your choice:");
        String choice = sc.nextLine();
        text.add(choice);
        int max = 0;
        if (choice.equals("1")) {
            max = 50;
        } else if (choice.equals("2")) {
            max = 100;
        } else if (choice.equals("3")) {
            max = 500;
        } else {
            System.out.println("Wrong choice!");
            return;
        }
        int secret = random.nextInt(max) + 1;
        System.out.println("I guessed a number from 1 to " + max + ". Try to guess!");
        while (true) {
            System.out.print("Your answer: ");
            int guess = sc.nextInt();
            if (guess == secret) {
                System.out.println("Correct! You guessed the number!");
                break;
            } else if (guess < secret) {
                System.out.println("My number is bigger");
            } else {
                System.out.println("My number is smaller.");
            }
        }
    }
}
