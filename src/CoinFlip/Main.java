package CoinFlip;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heads = 0;
        int tails = 0;
        int timesToFlip;

        System.out.print("I will flip a coin for you multiple times and give you the outcome. How many times should I "
                + "flip the coin? ");
        timesToFlip = input.nextInt();
        if (timesToFlip < 1) {
            System.out.println("Sorry, it is not possible to flip a coin less than 1 time. Please restart and try again.");
            System.exit(255);
        }
        System.out.println("Flipping a coin " + timesToFlip + " times.");

        for (int i = 0; i < timesToFlip; i++) {
            double random = random() + 0.5;
            int coinSide = (int) random;
            if (coinSide == 1) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println(String.format("Heads came up %d times (%.2f%%).", heads, (float) heads / timesToFlip * 100));
        System.out.println(String.format("Tails came up %d times (%.2f%%).", tails, (float) tails / timesToFlip * 100));
    }
}
