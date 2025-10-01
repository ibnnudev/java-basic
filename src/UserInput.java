import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter ur age: ");
        // int age = scanner.nextInt();
        // scanner.nextLine();

        // System.out.print("Enter ur favorite color: ");
        // String color = scanner.nextLine();

        // System.out.println("Your'e " + age + " y.o");
        // System.out.println("You like the color " + color);

        // Calculate area of triangle
        
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        // Result
        double result = (a + b + c) / 2;
        double area = Math.sqrt(result * (result - a) * (result - b) * (result - c));

        System.out.println("The area of triangle is: " + Math.round(area));

        scanner.close();
    }
}