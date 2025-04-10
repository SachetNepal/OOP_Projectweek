package week4;

import java.util.Scanner;
import java.util.Random;

public class DiceSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many sides does die 1 have? ");
        int sides1 = scan.nextInt();
        System.out.print("How many sides does die 2 have? ");
        int sides2 = scan.nextInt();

        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= 3; i++) {
            int roll1 = rand.nextInt(sides1) + 1;
            int roll2 = rand.nextInt(sides2) + 1;

            sum1 += roll1;
            sum2 += roll2;

            System.out.println("Die 1 roll " + i + " = " + roll1 + ".");
            System.out.println("Die 2 roll " + i + " = " + roll2 + ".");
        }

        System.out.println("Die 1 rolled a total of " + sum1 + " and rolled " + (sum1 / 3.0) + " on average.");
        System.out.println("Die 2 rolled a total of " + sum2 + " and rolled " + (sum2 / 3.0) + " on average.");
    }
}
