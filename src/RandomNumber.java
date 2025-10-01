import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        // int randomNumber = random.nextInt(0, 100);
        // System.out.println("Generated random number: " + randomNumber);

        boolean isHeads = random.nextBoolean();
        if (isHeads)
            System.out.println("It's Heads!");
        else
            System.out.println("It's Tails!");

    }
}