package week2;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = 1.60935;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = scan.nextDouble();

        double kilometers = miles * CONVERSION_FACTOR;
        System.out.println(miles + " miles is " + kilometers + " kilometers.");
    }
}

