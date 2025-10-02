import java.util.Random;
import java.util.Scanner;

public class DiceRole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice <= 0) {
            System.out.println("Number of dice must be greater than 0.");
            return;
        }

        for (int i = 0; i < numOfDice; i++) {
            int roll = random.nextInt(1, 7);
            printDie(roll);
            System.out.println("Roll " + (i + 1) + ": " + roll);
            total += roll;
        }

        System.out.println("Total: " + total);

        scanner.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                -----
                |   |
                | o |
                |   |
                -----""";
        String dice2 = """
                -----
                |o  |
                |   |
                |  o|
                -----""";
        String dice3 = """
                -----
                |o  |
                | o |
                |  o|
                -----""";
        String dice4 = """
                -----
                |o o|
                |   |
                |o o|
                -----""";
        String dice5 = """
                -----
                |o o|
                | o |
                |o o|
                -----""";
        String dice6 = """
                -----
                |o o|
                |o o|
                |o o|
                |o o|
                -----""";
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }

        System.out.println();
    }
}