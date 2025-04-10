package week2;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scan.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scan.nextInt();

        if (denominator != 0) {
            double result = (double) numerator / denominator;
            System.out.println("The decimal equivalent is " + result);
        } else {
            System.out.println("Denominator cannot be zero.");
        }
    }
}

