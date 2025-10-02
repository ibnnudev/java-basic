import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        // String[] heros = { "deadpool", "thor", "hulk" };
        // int numOfHeros = heros.length;
        // Arrays.sort(heros);
        // Arrays.fill(heros, "iron man");
        // for (String hero : heros) {
        // System.out.println(hero);
        // }

        Scanner scanner = new Scanner(System.in);
        String[] students;

        System.out.print("Masukan jumlah murid: ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        students = new String[numOfStudents];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Masukan nama murid ke-" + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        System.out.println("Daftar murid: " + Arrays.toString(students));

        scanner.close();
    }

}