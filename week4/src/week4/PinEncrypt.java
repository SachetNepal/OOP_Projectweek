package week4;

import java.util.Scanner;
import java.util.Random;

public class PinEncrypt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scan.nextInt();

        String hexPin = Integer.toHexString(pin);
        int rand1 = 1000 + rand.nextInt(64536 - 1000);
        int rand2 = 1000 + rand.nextInt(64536 - 1000);

        String encrypted = Integer.toHexString(rand1) + hexPin + Integer.toHexString(rand2);

        System.out.println("Your encrypted pin number is " + encrypted + ".");
    }
}
