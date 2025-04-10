package week3;

import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println("Reversed sentence:");
        System.out.println(result.toString().trim());
    }
}

