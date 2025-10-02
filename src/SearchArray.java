import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = { 1, 2, 6, 3, 4, 7, 8 };
        String[] foods = { "soto", "sate", "mie" };
        boolean isFound = false;

        System.out.print("Enter a food to search: ");
        String target = scanner.nextLine();

        for (int i = 0; i < foods.length; i++) {
            if (foods[i].equals(target)) {
                System.out.println("element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("element not exist in array");
        }

        scanner.close();
    }
}