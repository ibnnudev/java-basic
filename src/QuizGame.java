import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        // JAVA QUIZ GAME

        String[] questions = {
                "1. What is the capital of Indonesia?",
                "2. Who is the first president of Indonesia?",
                "3. What is the largest island in Indonesia?"
        };

        String[][] options = {
                { "A. Jakarta", "B. Bali", "C. Surabaya", "D. Medan" },
                { "A. Soekarno", "B. Suharto", "C. Joko Widodo", "D. Megawati" },
                { "A. Sumatra", "B. Java", "C. Borneo", "D. Papua" }
        };

        char[] answers = { 'A', 'A', 'D' };

        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("You will be asked " + questions.length + " questions.");
        System.out.println("Type the letter of the correct answer (A, B, C, or D) and press Enter.");
        System.out.println("Let's begin!\n");

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + ".\n");
            }
        }

        System.out.println("Quiz Over! Your final score is " + score + " out of " + questions.length + ".");
        scanner.close();
    }
}