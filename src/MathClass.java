import java.util.Scanner;

public class MathClass {

    public static void main(String[] args) {
        // int a = 10;
        // int b = 3;

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        // System.out.println();

        // System.out.println("a + b = " + (a + b));
        // System.out.println("a - b = " + (a - b));
        // System.out.println("a * b = " + (a * b));
        // System.out.println("a / b = " + (a / b));
        // System.out.println("a % b = " + (a % b));
        // System.out.println();

        // System.out.println("Math.abs(a) = " + Math.abs(a));
        // System.out.println("Math.abs(-a) = " + Math.abs(-a));
        // System.out.println();

        // System.out.println("Math.max(a, b) = " + Math.max(a, b));
        // System.out.println("Math.min(a, b) = " + Math.min(a, b));
        // System.out.println();

        // double c = 1.8;
        // System.out.println("c = " + c);
        // System.out.println("Math.round(c) = " + Math.round(c));
        // System.out.println("Math.ceil(c) = " + Math.ceil(c));
        // System.out.println("Math.floor(c) = " + Math.floor(c));
        // System.out.println();

        // double d = 64;
        // System.out.println("d = " + d);
        // System.out.println("Math.sqrt(d) = " + Math.sqrt(d));
        // System.out.println("Math.pow(d, 3) = " + Math.pow(d, 3));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side A: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double b = scanner.nextDouble();

        double result = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("side c is : " + result + "cm");

        scanner.close();
    }
}