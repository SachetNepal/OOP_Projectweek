package week2;

import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the square's side: ");
        int side = scan.nextInt();

        int perimeter = 4 * side;
        int area = side * side;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}

